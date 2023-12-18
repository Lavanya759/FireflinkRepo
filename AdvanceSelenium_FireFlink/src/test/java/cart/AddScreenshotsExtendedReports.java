package cart;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AddScreenshotsExtendedReports {
	@Test
	public void screenshot()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String screenshotpath=ts.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter spark=new ExtentSparkReporter("./reports/screenshotReport");
		spark.config().setDocumentTitle("DEmo Report");
		spark.config().setTheme(Theme.DARK);//Theme.Standard
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test=report.createTest("screenshot","Error occured while capturing the screenshots");//if screenshots is not able to capture then error messages needs to be displayed then put as a second parameter
		test.log(Status.INFO, "added screenshot");
		test.addScreenCaptureFromBase64String(screenshotpath);
		report.flush();
	}
}
