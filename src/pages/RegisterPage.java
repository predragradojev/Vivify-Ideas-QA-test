package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasicPage {

	public RegisterPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	// Elements

	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getConfirmedPassword() {
		return driver.findElement(By.id("password-confirmation"));
	}

	public WebElement getAcceptedCheckBox() {
		return driver.findElement(By.className("form-check-input"));
	}

	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//button"));
	}

	public WebElement getRegister() {
		return driver.findElement(By.xpath("//a[@href='/register']"));
	}
	
	public WebElement getLogin() {
		return driver.findElement(By.xpath("//a[@href='/login']"));
	}


	

	// Methods

	public void Register(String firstName, String lastName, String email, String password, String confirmedPassword)
			throws InterruptedException {
		this.getFirstName().sendKeys(firstName);
		Thread.sleep(1000);
		this.getLastName().sendKeys(lastName);
		Thread.sleep(1000);
		this.getEmail().sendKeys(email);
		Thread.sleep(1000);
		this.getPassword().sendKeys(password);
		Thread.sleep(1000);
		this.getConfirmedPassword().sendKeys(confirmedPassword);
		Thread.sleep(1000);
		this.getAcceptedCheckBox().click();
		Thread.sleep(1000);
		this.getSubmitBtn().click();
	}

}
