package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNGListener.Listener.class)
public class MyTestClass {
	@Test
	public void myTest() //if we want skipped then use another method as a fail.
	{
		Assert.fail();
	}
	
    @Test(dependsOnMethods = "myTest")
    public void myMethod() 
    {
    	//Assert.fail();//If WE Want Forcefully Failed the Method
    	Reporter.log("Hi I am Vaibhav", true);
    }
}
