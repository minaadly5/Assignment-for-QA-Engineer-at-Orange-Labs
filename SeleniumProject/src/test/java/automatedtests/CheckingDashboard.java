package automatedtests;

import org.testng.annotations.Test;

import pageobjectmodels.DashBoardPage;
import utils.BaseClass;


public class CheckingDashboard extends BaseClass{
  @Test
  public void logintosite() {
	  DashBoardPage pageInstance =  new DashBoardPage(driver); 
	  System.out.println("This is a valid login scenario");
	  pageInstance.validateLegend();
	 
  }
  
}