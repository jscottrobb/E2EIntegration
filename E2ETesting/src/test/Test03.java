package test;

import org.testng.annotations.*;
import org.openqa.selenium.chrome.*;

public class Test03 {

	@Test
	public void testcase1 () {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	};
}

