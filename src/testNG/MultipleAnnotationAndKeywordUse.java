package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleAnnotationAndKeywordUse {
	  @Test
	  public void C() 
	  {
		  Reporter.log("C is running", true);
	  }
	  @Test(priority = -2,invocationCount = 3,timeOut = 900,enabled = true, dependsOnMethods = {"C"})
	  public void A() 
	  {
		  Reporter.log("A is running", true);
	  }
	  @Test
	  public void B() 
	  {
		  Reporter.log("B is running", true);
	  }
}
