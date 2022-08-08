package learnseleniumgrid;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





public class PageTitleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		 
		 // Step - 1 : Set the browser .exe path
		 // Step - 2 : Create the object of DesiredCapabilities class
		 // Step - 3 : Set browserName using setCapability method
		 // Step - 4 : Set version using setCapability method
		 // Step - 5 : Set platform using setCapability method
		 /**
		  *  Step - 6 : Create the object of RemoteWebDriver 
		  *  a. Set the *Node* URL
		  *  b. Pass DesiredCapabilities object
		  */
		}
	
	@Test
	public void getPageTitle() {
		String expPageTitle = "React App";
		
		// Step - 1 : Get the URL of application.
		// Step - 2 : Get the page title 
		// Step - 3 : Assert actual page title with expected page title.
		
	}
	
}
