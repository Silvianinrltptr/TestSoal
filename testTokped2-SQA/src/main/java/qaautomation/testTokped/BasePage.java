package qaautomation.testTokped;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

	public BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}
	
	public ThreadLocal<WebDriver> getDriver() {
		return driver;
	}
	
	public void setDriver(ThreadLocal<WebDriver> driver) {
		this.driver = driver;
	}
}