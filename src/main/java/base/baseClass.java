package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import core.coreClass;

public class baseClass {

	static WebDriver driver;
	coreClass c = new coreClass(driver);

	public baseClass(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToURL(String url) {
		c.navigateToURL(url);
	}

}
