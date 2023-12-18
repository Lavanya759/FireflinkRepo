package register;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners(ListnerImplementation.class)
public class TC_DWS_002 {
	public static ExtentReports report;//report will be displayed as null for second execution that is the reason take it as static
	ChromeDriver driver;
	public static ExtentTest test;
	@BeforeSuite
	public void configReports() {
		String time=LocalDateTime.now().toString().replace(":", "-");
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/Extentreports"+time+".html");
		report=new ExtentReports();
		report.attachReporter(spark);
	}
	@BeforeClass
	public void launchBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
	@AfterSuite
	public void reportBackup() {
	report.flush();
	}
	@BeforeMethod
	public void testReport(Method method)
	{
		ExtentTest test=report.createTest(method.getName());
	}
	
}
