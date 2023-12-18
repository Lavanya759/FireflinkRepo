package login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class launchingAppInVariousPlatformThroughInputFromCommandPrompt {
	WebDriver driver;
	@Parameters("browser")
	@Test(groups="smoke1")
	public void receiveData(String browserName) {
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FireFox"))
		{
			driver=new FirefoxDriver();
		}
		String URL=System.getProperty("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
}
}
