package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGallery extends BasicPage {

	public CreateGallery(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public WebElement getTitle() {
		return driver.findElement(By.id("title"));
	}

	public WebElement getDescriptions() {
		return driver.findElement(By.id("description"));
	}

	public WebElement getImages() {
		return driver.findElement(By.className("form-control"));
	}

	public WebElement getAddImage() {
		return driver.findElement(By.xpath("//button[text()='Add image']"));
	}

	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//button[text()='Submit']"));
	}

	public WebElement getCancel() {
		return driver.findElement(By.xpath("//button[text()='Cancel']"));
	}

	// Methods

	public void AddUrlImages(int numberOfImg, String UrlPhoto) {
		WebElement img = driver
				.findElement(By.xpath("//div//div[2]//div[1]//div[1]//form//div[3]/div[" + numberOfImg + "]//input"));
		img.sendKeys(UrlPhoto);

	}

	public void AddImage() {
		this.getAddImage().click();
	}

	public void CreateImgInfo(String title, String description) {
		this.getTitle().sendKeys(title);
		this.getDescriptions().sendKeys(description);

	}

	public void DeleteImg(int numberOfImg) {
		WebElement img = driver
				.findElement(By.xpath("//div//div[2]//div[1]//div[1]//form//div[3]/div[" + numberOfImg + "]//i"));
		img.click();
	}

	public void Submit() {
		this.getSubmit().click();
	}

	public void Cancel() {
		this.getCancel().click();
	}

}
