package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
	
// this class contains webDriver initialization, browser preconditions like maximize window, delete cookies & wait objects
	
// public is access modifier & static is used as the given method or variable is going to remain same for any instance of this class,
// we are not going to have variable or method with same name, so to save memory which will be used for creating object of this class
// and calling specific method or variable, we declared it as static. when static it becomes a part of the class, can be called without object.

	public static WebDriver driver;
	public static WebDriverWait explicitWait = null;
	public static Wait<WebDriver> fluentWait = null;

	public static void browserInitialization(String browser, String url) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		//set the implicit wait right after initializing the WebDriver instance
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		explicitWait = new WebDriverWait(driver, Duration.ofMillis(10000));
		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(10000)).pollingEvery(Duration.ofMillis(500));
		//navigate can help if we want to move through pages later in test case
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(url);
		
			
	}

}
