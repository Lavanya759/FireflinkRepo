package compaines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AppleTest {
	@Test
	public void launchApple() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/");
		Reporter.log("apple launched",true);
}
}
