package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage {

	// Elements

	public LoginPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("password"));

	}

	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//button[contains(@class, 'btn-custom')]"));
	}

	// Methods
	
	public void userLogin(String email, String password) throws InterruptedException {
		this.getEmail().sendKeys(email);
		Thread.sleep(1000);
		this.getPassword().sendKeys(password);
		Thread.sleep(1000);
		this.getSubmit().click();
	}

}
