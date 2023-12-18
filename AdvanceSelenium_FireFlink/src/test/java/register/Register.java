package register;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Register extends TC_DWS_002 {
	@Test
	public void RegisterTest(Method method)//to get the name of the particular method name
	{
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register","failed to open login");
	test.log(Status.PASS, "user registered successfully");
	}
}
