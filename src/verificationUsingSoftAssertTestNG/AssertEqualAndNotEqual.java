package verificationUsingSoftAssertTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualAndNotEqual
{
	SoftAssert soft= new SoftAssert();
  @Test
  public void MyMethod() // here we can use assertequalAndNotEqual method
  {
	  String a ="pune";
	  String b ="pune";
	  String c ="Mumbai";
	  
	  soft.assertEquals(a, b,"TC is passed both are equal");
	  Reporter.log("Tc is passed both are equal", true);
	  
	  soft.assertNotEquals(a, c,"TC is failed both are not equal");
	  Reporter.log("Tc is passed both are equal", true);
	  
	  soft.assertAll();
  }
  
  @Test
  public void MyMethod2()// here we can use assertTrueAndFalse method
  {
	  boolean a = true;
	  soft.assertTrue(a, "a is not true TC is failed");
	  Reporter.log("a is true And TC is passed", true);
	  
	  soft.assertAll();
  }
  
}
