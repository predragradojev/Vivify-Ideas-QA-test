package tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pages.CreateGallery;
import pages.LoginPage;
import pages.GalleryAppPage;
import pages.RegisterPage;

public abstract class BasicTest {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected SoftAssert softAssert;
	protected JavascriptExecutor js;
	protected CreateGallery createGallery;
	protected LoginPage loginPage;
	protected RegisterPage registerPage;
	protected GalleryAppPage galleryAppPage;

	String baseURL = "https://gallery-app.vivifyideas.com";
	String password = "vivify2021";
	String email = "vivifyideastest2021@gmail.com";
	String urlImage1 = "https://stil.kurir.rs/data/images/2020/10/22/14/232091_shutterstock-1055527511_ff.jpg";
	String urlImage2 = "https://www.activebeauty.rs/imgs/1440/1000/85//data/SR/wp-content/uploads/2019/06/natur-erleben-1-1920x1200.jpg";
	String search = "Priroda";

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		createGallery = new CreateGallery(driver, wait, js);
		loginPage = new LoginPage(driver, wait, js);
		galleryAppPage = new GalleryAppPage(driver, wait, js);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException, InterruptedException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot scrShot = ((TakesScreenshot) this.driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			String imgName = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss'.png'").format(new Date());
			FileHandler.copy(SrcFile, new File("screenshots/" + imgName));
			Thread.sleep(2000);
			this.driver.quit();
		}

		else {
			this.driver.quit();
		}
	}

}
