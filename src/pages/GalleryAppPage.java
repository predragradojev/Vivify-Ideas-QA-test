package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GalleryAppPage extends BasicPage {

	public GalleryAppPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	// Elements

	public WebElement getSearch() {
		return driver.findElement(By.xpath("//input"));
	}

	public WebElement getFilter() {
		return driver.findElement(By.xpath("//button"));
	}

	public WebElement getLoadMoreBtn() {
		return driver.findElement(By.xpath("//button[text()='Load More']"));
	}

	public WebElement getLogout() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]"));
	}

	public WebElement getAllGalleries() {
		return driver.findElement(By.xpath("//a[contains(@class, 'nav-link')]"));
	}

	public WebElement getGalleryApp() {
		return driver.findElement(By.xpath("//a[contains(@class, 'navbar-brand')]"));
	}

	public WebElement getMyGalleries() {
		return driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a"));
	}
	
	public WebElement getCreateGallery() {
		return driver.findElement(By.xpath("//a[@href='/create']"));
	}

	public List<WebElement> getLastImage() {
		return driver.findElements(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/div"));
	}

	// Methods

	public void LogOut() {
		this.getLogout().click();
	}

	public void Search(String search) {
		this.getSearch().sendKeys(search);
		this.getFilter().click();
	}

	public void ClearSearch() {
		this.getSearch().clear();
	}

	public void LoadMore() {
		this.getLoadMoreBtn().click();
	}

	public void AllGalleries() {
		this.getAllGalleries().click();
	}

	public void GalleryApp() {
		this.getGalleryApp().click();
	}

	public void MyGalleries() {
		this.getMyGalleries().click();
	}
	
	public void CreateGallery() {
		this.getCreateGallery().click();
	}
}
