
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.baseClass;

public class NewTest {
//	private WebDriver driver;
	WebDriver driver;
	
	
  @Test
  public void f() {
	  baseClass c =new baseClass(driver);
	  
	  c.navigateToURL("https://www.youtube.com/");
	  
	  
  }
  
//  public static void main(String[] args) {
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(chromeOptions);
//		
//		// Navigate to the demoqa website
//		driver.get("https://www.demoqa.com");
//		
//		driver.quit();
//
//	}
  
  
	
}
