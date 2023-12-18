package register;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListnerImplementation extends TC_DWS_002 implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		String screenshotpath=ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshotpath,"Error Image");
		test.log(Status.FAIL,"test case failed");
	}
	

}
