package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import components.TextField;
import components.TextFieldImpl;
import core.pageobjects.upm.reporterWeb.AddEditDashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import webelements.factory.api.ElementFactory;

public class coreClass {


	@FindBy(xpath = "//input[@name='search_query']")
	private WebElement searchfield;
	static WebDriver driver;

	public coreClass(WebDriver driver) {
		this.driver = driver;
//		 coreClass login=PageFactory.initElements(driver, coreClass.class);
		PageFactory.initElements(driver, this);
	}

	public void navigateToURL(String url) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.navigate().to(url);
//		searchfield.enterText("Selenium Tutorial");
//		searchfield.sendKeys("Selenium Tutorial");
		 driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Tutorial");
		 driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
//		 driver.findElement(By.xpath("//tp-yt-paper-button[contains(@aria-label,'Search filters')]")).click();
		
		 driver.findElement(By.xpath("//yt-formatted-string[text()='Filters']")).click();
		 driver.findElement(By.xpath("//yt-formatted-string[text()='Video']")).click();
	}

}
