package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeMyTest4 {
	// if we want include 1,3,5 then use Include Keyword in xml file.
	@Test(groups = "regression")
	  public void MyMethod8() 
	  {
		  Reporter.log("My Method 8 regression is running", true);
	  }
	@Test(groups = "sanity")
	  public void MyMethod9() 
	  {
		  Reporter.log("My Method 9 sanity is running", true);
	  }
	@Test
	  public void MyMethod10() 
	  {
		  Reporter.log("My Method 10 is running", true);
	  }
	@Test(groups = "sanity")
	  public void MyMethod11() 
	  {
		  Reporter.log("My Method 11 sanity is running", true);
	  }
}
