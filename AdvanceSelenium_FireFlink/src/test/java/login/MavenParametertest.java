package login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParametertest {//create .xml and in pom.xml give the group id and change the name to .xml name
@Test(groups="smoke1")
public void receiveData() {
	Reporter.log("maven parameter",true);
	String URL=System.getProperty("url");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(URL);
}
}
