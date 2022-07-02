package verificationUsingHardAssertTestNG;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse {
  @Test
  public void MyTest()
  {
	  boolean a = true;
	  boolean b = false;
	  boolean c = true;
	  
	  //Assert.assertTrue(c, "value of c is not matching and TC is failed");
	  //Reporter.log("value of c is true and TC is passed", true);
	  
	  Assert.assertFalse(b, "value is true And TC is failed");
	  Reporter.log("value is false And TC is Passed ", true);
  }
}
