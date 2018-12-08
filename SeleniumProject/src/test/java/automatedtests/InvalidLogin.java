package automatedtests;

import org.testng.annotations.Test;

import pageobjectmodels.LandingPage;
import utils.BaseClass;

public class InvalidLogin extends BaseClass{
	 @Test
	  public void logintosite() {
		  LandingPage pageInstance =  new LandingPage(driver); 
		  System.out.println("This is a valid login scenario");
		  pageInstance.pageNavigation();
		  pageInstance.fillInUsername("Admin24");
		  pageInstance.fillInPassword("admin252");
		  pageInstance.submittingCredentials();
		  pageInstance.validateIncorrectLogin();
	  }
}
