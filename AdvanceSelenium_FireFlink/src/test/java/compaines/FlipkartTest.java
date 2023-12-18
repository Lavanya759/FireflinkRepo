package compaines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipkartTest {
	@Test(groups="System")
	public void launchFlipkart() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("flipkart launched",true);
}
}
