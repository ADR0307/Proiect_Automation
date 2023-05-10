package T_Final;

import org.junit.Assume;

import junit.framework.Assert;

public class Utils extends PageSetup {
  public static boolean statusLoginUser(){
	  return driver.getPageSource().contains("Welcome, " +Constants.FIRSTNAME + " " + Constants.LASTNAME + "!");
  }
  
  public static void validationLogin(){
	  
	  Assert.assertTrue("Nu s-a putut face login utilizator!", statusLoginUser());
  }
  
  
  public static void preconditionLoginUser(){
	  boolean conditieL = driver.getPageSource().contains(Constants.FIRSTNAME + Constants.LASTNAME );
	  Assume.assumeTrue("Nu s-a putut face logout", conditieL);
  }
  
  
}

