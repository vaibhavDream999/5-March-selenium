package verificationUsingHardAssertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualAndNotEquals {
  @Test
  public void mymethod()  
  {
	  String s = "vaibhav";
	  String p = "vaibhav"; 
	  String m = "vaibhav2";
	  String n = "rohan";
	  
	  // If m and n are same it returns TC is passed Else it returns TC is fsiled
	//  Assert.assertEquals(s, n,"String are not matching TC is Failed");
	  Reporter.log("String is matching and TC is passed", true);
  
	  Assert.assertNotEquals(m, n,"String are not matching TC is passed");
	  Reporter.log("String is not matching and TC is passed", true);
  }
}
