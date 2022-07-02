package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeMyTest3 {
	@Test(groups = "sanity")
	  public void MyMethod1() 
	  {
		  Reporter.log("My Method 1 sanity is running", true);
	  }
	@Test
	  public void MyMethod2() 
	  {
		  Reporter.log("My Method 2 is running", true);
	  }
	@Test(groups = "regression")
	  public void MyMethod3() 
	  {
		  Reporter.log("My Method 3 regression is running", true);
	  }
	@Test
	  public void MyMethod4() 
	  {
		  Reporter.log("My Method 4 is running", true);
	  }
	@Test(groups = "regression")
	  public void MyMethod5() 
	  {
		  Reporter.log("My Method 5 regression is running", true);
	  }
	@Test(groups = "sanity")
	  public void MyMethod6() 
	  {
		  Reporter.log("My Method 6 sanity is running", true);
	  }
	@Test(groups = "regression")
	  public void MyMethod7() 
	  {
		  Reporter.log("My Method 7 is running", true);
	  }
}
