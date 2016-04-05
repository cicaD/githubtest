/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.af.ext.selenium.inst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author spidr
 */
public class LogIn_Page {
    
    private static WebElement element = null;
 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.id("log"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.id("pwd"));
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.id("login"));
 
         return element;
 
         }

    
    
    
}
