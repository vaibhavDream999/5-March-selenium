package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DuplicatePriority {
  @Test(priority = 2)
  public void f() 
  {
	  Reporter.log("f is running", true);
  }
  @Test(priority = 2)
  public void A() 
  {
	  Reporter.log("A is running", true);
  }
  @Test(priority = 2)
  public void Ashwini() 
  {
	  Reporter.log("A is running", true);
  }
  @Test(priority = 2)
  public void Ashish() 
  {
	  Reporter.log("A is running", true);
  }
}
