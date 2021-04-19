package app.coinswitch.testclasses;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseTest {
	protected AndroidDriver driver;
	protected WebDriverWait wait;

	public BaseTest() {
		// TODO Auto-generated constructor stub
	}

	@Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "<Add deviceName here>");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability("udid", "<Add UDID here");
	    desiredCapabilities.setCapability("appPackage", "com.coinswitch.kuber");
	    desiredCapabilities.setCapability("appActivity", "com.coinswitch.kuber.MainActivity");
	    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("noReset", true);
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    wait = new WebDriverWait(driver,20);
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	  }
	  
	  @After
	  public void tearDown() {
	    driver.quit();
	  }

}
