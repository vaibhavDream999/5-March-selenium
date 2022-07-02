package verificationUsingHardAssertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNullAndAssertNull {
  @Test
  public void myTest()
  {
	  String a = null;
	  String b = "copper";
	  
//	  Assert.assertNotNull(b, "value is null and TC is failed");
//	  Reporter.log("value is null And TC is passed", true);
 
	  Assert.assertNull(b, "value is not null and TC is passed");
	  Reporter.log("value is not null and TC is passed", true);
  }
}
