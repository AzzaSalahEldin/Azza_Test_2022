package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.baseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
    WebDriver driver;

	String URL = "https://www.youtube.com/";
	baseClass base;

	@BeforeClass
	public void NewTest_BeforeClass() {
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			driver.navigate().to(URL);
	}
	@Test(enabled=true)
	public void case01() {
		base = new baseClass(driver);
		base.enterText("Selenium Tutorial");
		base.clickSearch();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		base.clickFilterMenu();
		base.clickOnVedio(2);
		Assert.assertEquals(base.getVedioTitle(), base.getVedioName(2));
	}

	@Test(enabled=true)
	public void case02() {
		base = new baseClass(driver);
		base.enterText("Test Automation Tutorial");
		base.clickSearch();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		base.clickFilterMenu();
		base.clickOnVedio(2);
		Assert.assertEquals(base.getVedioTitle(), base.getVedioName(2));
	}

	@Test(enabled=true)
	public void case03() {
		base = new baseClass(driver);
		base.enterText("Test Automation Tutorial");
		base.clickSearch();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		base.clickFilterMenu();
		base.clickOnVedio(10);
		Assert.assertEquals(base.getVedioTitle(), base.getVedioName(10));
	}
	@AfterClass
	public void NewTest_AfterClass() {
		base.closeDriver();
	}

}
