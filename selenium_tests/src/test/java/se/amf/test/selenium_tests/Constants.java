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
public class Constants {
    public static final boolean PASSES = true;
  /** Opposite of {@link #PASSES}.  */
  public static final boolean FAILS = false;
  
  /** Opposite of {@link #FAILURE}.  */
  public static final boolean SUCCESS = true;
  /** Opposite of {@link #SUCCESS}.  */
  public static final boolean FAILURE = false;

  /** 
   Useful for {@link String} operations, which return an index of <tt>-1</tt> when 
   an item is not found. 
  */
  public static final int NOT_FOUND = -1;
  
  /** System property - <tt>line.separator</tt>*/
  public static final String NEW_LINE = System.getProperty("line.separator");
  /** System property - <tt>file.separator</tt>*/
  public static final String FILE_SEPARATOR = System.getProperty("file.separator");
  /** System property - <tt>path.separator</tt>*/
  public static final String PATH_SEPARATOR = System.getProperty("path.separator");
  
  public static final String EMPTY_STRING = "";
  public static final String SPACE = " ";
  public static final String TAB = "\t";
  public static final String SINGLE_QUOTE = "'";
  public static final String PERIOD = ".";
  public static final String DOUBLE_QUOTE = "\"";
  public static final String PWD_WRONG = "xxxyyy";
  public static final String PWD_WRIGHT = "Abcd1234";
  public static final String USER_NAME_WRONG = "xxxyyy";
  public static final String USER_NAME_WRIGHT = "test_user";
  public static final String BASE_URL = "";
 
}
