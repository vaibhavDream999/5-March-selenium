package testNGListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import failTestUsingListener2.BaseClassUsingPropertyFile;

public class Listener implements ITestListener
{
	// OnTestPass
	// OnTestFail
	// OnTestSuccess
	// OnTestSkipped
	// OnTestStart
	// OnTestEnd
	BaseClassUsingPropertyFile bas= new BaseClassUsingPropertyFile();// To run fail Test 
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		// To Create object of BaseClassUsingPropertyFile
		String TCName = result.getName();
		try {
			bas.takeScreenshot(TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("TC is passed, ScreenShot is not taken",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC name is "+result.getName(), true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("TC is skipped, Please Check Dependent TC",true);
		ITestListener.super.onTestSkipped(result);
	}
}
