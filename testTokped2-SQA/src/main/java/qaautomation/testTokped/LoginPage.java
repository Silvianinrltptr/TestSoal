package qaautomation.testTokped;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	@FindBy(xpath = "//button[normalize-space()='Masuk']")
	private WebElement clickMasuk;

	@FindBy(xpath = "//body/div/div[@role='dialog']/button[2]/span[1]")
	private WebElement clickScanCode;


	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void loginScan(int second) {
			clickMasuk.click();
			clickScanCode.click();
	}

	public void pressMasuk() {
			clickMasuk.click();
	}

//	public void pressScanCode() {
//			clickScanCode.click();
//	}
//
//	public void emailphone(String emailphone) {
//		clickMasuk.click();
//		
//	}

}
