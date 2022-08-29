package qaautomation.testTokped;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ProdukPage extends BasePage{
	
	
	//mencari produk
		@FindBy (className = "css-1wc186l")
		private WebElement cariproduk;
		
	
	//klik pencarian
		@FindBy (xpath = "//button[@aria-label='Kirimkan']")
		private WebElement pencarian;
		
//	  klik produck
		@FindBy (xpath = "(//a[@title='tas pria kerja kantor briefcase pria premium kulit leather bag'])[1]")
		private WebElement clickproduk;
		
//	  klik wishlistProduk
//		@FindBy (xpath = "//button[normalize-space()='Wishlist']")
//		private WebElement wishlistproduk;
//		
//	  klik masuk
//		@FindBy (xpath = "//input[@id='email-phone']")
//		private WebElement emailphone;
//		
//	  jumlah produk search
		@FindBy (xpath = "//div[@class='css-8j9pkz']")
		private WebElement jumlahProduk;
		
		
	public ProdukPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
		// TODO Auto-generated constructor stub
	}
	
	public void cariproduk(String cari) {
		cariproduk.sendKeys(cari);
	}	
	
	public void pencarian() {
		pencarian.click();
	}
	
	public void clickProduk() {
		clickproduk.click();
	}
	
//	public void clickWishlistProduk() {
//		wishlistproduk.click();
//	}
	
//	public void clikEmailPhone() {
//		emailphone.click();
//	}
//	
	public String getJumlahProduk() {
		return jumlahProduk.getText();
	}
 
}
