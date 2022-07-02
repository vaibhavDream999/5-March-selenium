package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount = 4)// To Use Same Method Run Multiple Times.
  public void MyMethod() 
  {
	  Reporter.log("My Method is running", true);
  }
  @AfterMethod
  public void close() 
  {
	  Reporter.log("Closing Browser", true);
  }
}
