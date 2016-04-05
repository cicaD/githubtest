/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.af.ext.selenium.inst;

/**
 *
 * @author spidr
 */
import se.af.ext.selenium.inst.Constants;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

  ///// state variables  
    
  private WebDriver driver;
  private String baseURL;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private String user_name_valid = "";
  private String user_name_invalid = "Test";
  private String password_valid = "";
  private String password_invalid = "Test";
  
  
  ///// internal help metods

public void setPageURL (String pageURL)throws Exception { 
    baseURL = pageURL;    
}    

public void clearLoginFields ()throws Exception { 
    // driver.get(baseUrl + "/");
    driver.findElement(By.id("username-field")).clear();
    driver.findElement(By.id("password-field")).clear();
}  
public void loginUser(String user_name, String password, WebDriver page)
{
    page.findElement(By.id("username-field")).sendKeys(user_name);
    page.findElement(By.id("password-field")).sendKeys(password);
    page.findElement(By.xpath("//button[@type='submit']")).click();
}
  
private void connectToPage(String url)
{
    driver = new FirefoxDriver();
    baseURL = url;
    driver.get(baseURL + "/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
  

  @Before
  public  void setUp() throws Exception {
      
      connectToPage("http://nafutv.arbetsformedlingen.se/");
     
  }
  

  @Test
  public void testLoginFail() throws Exception {
   // driver.get(baseUrl + "/");
    clearLoginFields();
    loginUser(Constants.USER_NAME_WRIGHT, Constants.PWD_WRONG, driver);
    String alert = driver.findElement(By.className("alert")).getText();
    System.out.println(alert);
   
  }

  @Test
  public void testLoginOK() throws Exception {
   // driver.get(baseUrl + "/");
    clearLoginFields();
    loginUser(Constants.USER_NAME_WRIGHT, Constants.PWD_WRIGHT, driver);
  }

   
  @After
  public void tearDown() throws Exception {
    clearLoginFields();
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
