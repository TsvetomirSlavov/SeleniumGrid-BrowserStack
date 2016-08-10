package seleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class TestBrowserStack {

	public static final String USERNAME = "USERNAME"; // our username
	public static final String AUTOMATE_KEY = "ACCESS_KEY"; // our password = automate key
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		  public static void main(String[] args) throws Exception {

		    DesiredCapabilities caps = DesiredCapabilities.firefox();
		    	caps.setPlatform(Platform.WINDOWS);
		    	
			  
			  
			  /*DesiredCapabilities caps = new DesiredCapabilities();
		     	caps.setCapability("browser", "IE");
		    	caps.setCapability("browser_version", "7.0");
		    	caps.setCapability("os", "Windows");
		    	caps.setCapability("os_version", "XP"); */
		    	
		    	
		    caps.setCapability("browserstack.debug", "true"); //it'll give the visible logs & complete screenshot 
			   	
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("http://www.google.co.uk");
		    
		    WebElement element = driver.findElement(By.name("q"));

		    element.sendKeys("BrowserStack");
		    element.submit();

		    System.out.println(driver.getTitle());
		    driver.quit();
		  }
		}

//Test will run on https://browserstack.com/automate/    (cloud website)
// alternate website is https://saucelabs.com/  (for this cloud- website, the code remains same)


