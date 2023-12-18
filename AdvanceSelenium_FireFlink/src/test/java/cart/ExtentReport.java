package cart;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
@Test
public void demo()
{
	ExtentSparkReporter spark=new ExtentSparkReporter("./reports/ExtentReport.html");
	ExtentReports report=new ExtentReports();
	report.attachReporter(spark);
	ExtentTest test=report.createTest("demo");
	test.log(Status.PASS, "log message added into report");
	report.flush();
}
}
