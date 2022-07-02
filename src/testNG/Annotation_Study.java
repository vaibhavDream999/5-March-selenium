package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Study {
  @Test
  public void myMethod() 
  {
	  Reporter.log("Test Method is running", true);
  }
  @Test
  public void MyMethod() 
  {
	  Reporter.log("Test1 Method is running", true);
  }
  @BeforeMethod
  public void Login() 
  {
	  Reporter.log("Before Method is running", true);
  }
  @AfterMethod
  public void Logout() 
  {
	  Reporter.log("After Method is Running", true);
  }
  @BeforeClass
  public void LaunchBrowser() 
  {
	  Reporter.log("Before Class is running", true);
  }
  @AfterClass
  public void CloseBrowser() 
  {
	  Reporter.log("After class is running", true);
  }
}
