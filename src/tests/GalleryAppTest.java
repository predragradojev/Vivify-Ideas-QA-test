package tests;

import org.testng.annotations.Test;

public class GalleryAppTest extends BasicTest {

	@Test
	public void CreateGalery() throws InterruptedException {
		driver.get(this.baseURL + "/login");
		Thread.sleep(2000);
		this.loginPage.userLogin(email, password);
		Thread.sleep(2000);
		this.galleryAppPage.CreateGallery();
		Thread.sleep(2000);
		this.createGallery.CreateImgInfo("Priroda", "opis prirode");
		this.createGallery.AddUrlImages(1, urlImage1);
		Thread.sleep(2000);
		this.createGallery.AddImage();
		Thread.sleep(2000);
		this.createGallery.AddUrlImages(2, urlImage2);
		Thread.sleep(5000);
		this.createGallery.Submit();
		Thread.sleep(5000);
	}

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get(this.baseURL + "/login");
		Thread.sleep(2000);
		this.loginPage.userLogin(email, password);
		Thread.sleep(2000);
		this.galleryAppPage.LogOut();
		Thread.sleep(3000);
	}

	@Test
	public void FindGalleryTest() throws InterruptedException {
		driver.get(this.baseURL + "/login");
		Thread.sleep(2000);
		this.loginPage.userLogin(email, password);
		Thread.sleep(2000);
		this.galleryAppPage.Search(search);
		Thread.sleep(2000);
		this.galleryAppPage.ClearSearch();
		Thread.sleep(2000);

	}

	@Test
	public void LogOutTest() throws InterruptedException {
		driver.get(this.baseURL + "/login");
		Thread.sleep(2000);
		this.loginPage.userLogin(email, password);
		Thread.sleep(2000);
		this.galleryAppPage.LogOut();
		Thread.sleep(2000);

	}

}
