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
		produkPage.clickProduk();
		Utility.hardWait(3);
//		produkPage.clickWishlistProduk();

//		disini untuk masuk ke wishlist harus login terlebih dahulu tapi saya coba untuk login melewati chrome driver test ini tidak bisa seperti diblock dari tokopedianya
//		dan untuk memasukan wishlist harus masuk ke produk yang kita search tapi disini saya coba mendapak error access denied
		
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
