package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
	@Test(timeOut = 1000)
	  public void C() throws InterruptedException 
	  {
		Thread.sleep(1500);
		  Reporter.log("C is running", true);
	  }
	  @Test
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
