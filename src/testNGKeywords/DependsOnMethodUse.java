package testNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	@Test
	  public void C() 
	  {
		Assert.fail();// Use Assert Class to Fail method
		  Reporter.log("C is running", true);
	  }
	  @Test(dependsOnMethods = {"C"})
	  public void A() 
	  {
		  Reporter.log("A is running", true);
	  }
	  @Test
	  public void B() 
	  {
		  Reporter.log("B is running", true);
	  }
	  @Test
	  public void D() 
	  {
		  Reporter.log("D is running", true);
	  }
}
