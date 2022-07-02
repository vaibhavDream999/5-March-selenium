package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
	
	// It is used to indicate sequence of method
  @Test(priority = -2)
  public void C() 
  {
	  Reporter.log("C is running", true);
  }
  @Test(priority = 0)
  public void A() 
  {
	  Reporter.log("A is running", true);
  }
  @Test(priority = 10)
  public void B() 
  {
	  Reporter.log("B is running", true);
  }
  @Test(priority = -3)
  public void D() 
  {
	  Reporter.log("D is running", true);
  }
}
