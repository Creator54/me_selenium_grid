package learnseleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





public class PageTitleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		 
		 // Step - 1 : Set the browser .exe path
		WebDriverManager.chromedriver ().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver (new URL ("http://localhost:4444/wd/hub"), options);
		 // Step - 2 : Create the object of DesiredCapabilities class
		 // Step - 3 : Set browserName using setCapability method
		 // Step - 4 : Set version using setCapability method
		 // Step - 5 : Set platform using setCapability method
		 /**
		  *  Step - 6 : Create the object of RemoteWebDriver 
		  *  a. Set the Hub URL
		  *  b. Pass DesiredCapabilities object
		  */
	}
	
	@Test
	public void getPageTitle() {
		String expPageTitle = "React App";
		driver.get ("https://google.com");
		driver.quit ();

		// Step - 1 : Get the URL of application.
		// Step - 2 : Get the page title 
		// Step - 3 : Assert actual page title with expected page title.
		
	}
	
}
