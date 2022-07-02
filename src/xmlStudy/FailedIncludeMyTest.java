package xmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedIncludeMyTest {
	// if we want include 1,3,5 then use Include Keyword in xml file.
	@Test
	  public void MyMethod1() 
	  {
		Assert.fail();
		  Reporter.log("My Method 1 is running", true);
	  }
	@Test
	  public void MyMethod2() 
	  {
		  Reporter.log("My Method 2 is running", true);
	  }
	@Test
	  public void MyMethod3() 
	  {
		//Assert.fail();
		  Reporter.log("My Method 3 is running", true);
	  }
	@Test
	  public void MyMethod4() 
	  {
		  Reporter.log("My Method 4 is running", true);
	  }
	@Test
	  public void MyMethod5() 
	  {
		  Reporter.log("My Method 5 is running", true);
	  }
	@Test
	  public void MyMethod6() 
	  {
		  Reporter.log("My Method 6 is running", true);
	  }
	@Test
	  public void MyMethod7() 
	  {
		  Reporter.log("My Method 7 is running", true);
	  }
}
