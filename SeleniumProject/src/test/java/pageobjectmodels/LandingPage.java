package pageobjectmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.ActionsList;

public class LandingPage {
	
	private WebDriver driver;
	
	private By userNameField = By.id("txtUsername");
	private By passwordField = By.id("txtPassword");
	private By loginButton = By.id("btnLogin");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void pageNavigation () {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void fillInUsername(String username){
		ActionsList.webElementToBeVisibleByID("txtUsername",driver);
		driver.findElement(userNameField).sendKeys(username);
		System.out.println("A username has been Entered");
	}
	
	public void fillInPassword(String Password){
		ActionsList.webElementToBeVisibleByID("txtPassword",driver);
		driver.findElement(passwordField).sendKeys(Password);
		System.out.println("A password has been Entered");
	}
	
	public void submittingCredentials(){
		ActionsList.webElementToBeVisibleByID("btnLogin",driver);
		driver.findElement(loginButton).click();
		System.out.println("Credentials are submitted");
	}
	public void validateCorrectLogin(){
			ActionsList.webElementToBeVisibleByXpath("//*[@id=\"content\"]/div/div[1]/h1",driver);
			System.out.println("Valid Login");
			Assert.assertTrue(true);
	}
	public void validateIncorrectLogin(){
		ActionsList.webElementToBeVisibleByID("spanMessage",driver);
		System.out.println("Invalid Login");
		Assert.assertTrue(true);
}



}
