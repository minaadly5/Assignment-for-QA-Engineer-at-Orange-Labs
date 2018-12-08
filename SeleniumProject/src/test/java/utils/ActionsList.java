package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsList {
	public static  WebDriver driver;
	public static void webElementToBeVisibleByID(String locator,WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}
	
	public static void webElementToBeVisibleByXpath(String locator,WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	
	

}
