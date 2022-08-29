package qaautomation.testTokped;

import org.testng.annotations.Test;


@Test
public class Running extends BasePageTokped {

	String cariproduk = "tas kerja";
//	String emailphone	= "nurlitaputrisilviani@gmail.com";
	
	@Test
	public void Wishlist() {
		
		ProdukPage produkPage = new ProdukPage(getDriver(), getExplicitWait());
//		LoginPage loginPage = new LoginPage(getDriver(), getExplicitWait());
//		loginPage.pressMasuk();
//		Utility.hardWait(3);
		produkPage.cariproduk(cariproduk);
		produkPage.pencarian();
		Utility.hardWait(3);
//		produkPage.clickProduk();
//		Utility.hardWait(3);
//		produkPage.clickWishlistProduk();
//		loginPage.emailphone(emailphone);
	} 

	@Test
	public void GetSearchProduk() {
		ProdukPage produkPage = new ProdukPage(getDriver(), getExplicitWait());
		produkPage.cariproduk(cariproduk);
		produkPage.pencarian();
		Utility.hardWait(3);
		String jumlahProduk = produkPage.getJumlahProduk();
		System.out.println(jumlahProduk);
	}	
}
