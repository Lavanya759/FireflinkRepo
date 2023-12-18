package register;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Login extends TC_DWS_002 {
	@Test
	public void loginTest(Method method)//to get the name of the particular method name
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","failed to open login");
		ExtentTest test=report.createTest(method.getName());
		test.log(Status.PASS, "user naviagated to login page");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("lavanyasreddy214@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Lavanya75@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","user failed to login");
		test.log(Status.PASS, "user successfully logged in");
		
	}
}
