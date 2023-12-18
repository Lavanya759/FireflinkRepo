package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebLogin {
	@Test
	public void receiveData() {
		Reporter.log("maven parameter",true);
		String Url=System.getProperty("url");
		String Email=System.getProperty("email");
		String Password=System.getProperty("password");
		ChromeDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
}
}
