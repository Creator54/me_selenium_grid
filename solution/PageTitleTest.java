package learnseleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {

		// Step - 1 : Set the browser .exe path
		System.setProperty("webdriver.chrome.driver",
				"/Users/admin/Desktop/Bytes/me_selenium_grid/LearnSeleniumGrid/chromedriver");

		// Step - 2 : Create the object of DesiredCapabilities class
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");

		// Step - 4 : Set version using setCapability method
		capabilities.setCapability("version", "103.0.5060.134");
		// Step - 5 : Set platform using setCapability method
		capabilities.setCapability("platform", "MAC");
		/**
		 * Step - 6 : Create the object of RemoteWebDriver
		 * a. Set the Hub URL
		 * b. Pass DesiredCapabilities object
		 */
		driver = new RemoteWebDriver(new URL("http://192.168.1.2:4444/wd/hub"), capabilities);
	}

	@Test
	public void getPageTitle() {
		// Assert.assertFalse(true);
		String expPageTitle = "React App";

		// Step - 1 : Get the URL of application.
		driver.get("https://web-locators-static-site-qa.vercel.app/Button");

		// Step - 2 : Get the page title
		String actPageTitle = driver.getTitle();

		// Step - 3 : Assert actual page title with expected page title.
		Assert.assertEquals(actPageTitle, expPageTitle);
	}

	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}
}
