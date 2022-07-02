package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotation_Study1 {
  @Test
  public void MyMethod2() 
  {
	  Reporter.log("Test2 method is running", true);
  }
  @Test
  public void MyMethod3() 
  {
	  Reporter.log("Test3 Method is running", true);
  }
}
