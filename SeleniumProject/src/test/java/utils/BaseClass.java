package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	protected static WebDriver driver = null;

	@BeforeSuite
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		   driver = new ChromeDriver();
	  }

	@AfterSuite
	  public void afterClass() {
		  driver.quit();
	  }

	}


