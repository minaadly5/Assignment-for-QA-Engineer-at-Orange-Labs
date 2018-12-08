package pageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.ActionsList;


public class DashBoardPage{
	private  WebDriver driver;
		
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	public  void validateLegend(){
		ActionsList.webElementToBeVisibleByXpath("//*[@id=\"div_legend_pim_employee_distribution_legend\"]/table/tbody/tr[1]/td[2]", driver);
		ActionsList.webElementToBeVisibleByXpath("//*[@id=\"div_legend_pim_employee_distribution_legend\"]/table/tbody/tr[2]/td[2]", driver);
		ActionsList.webElementToBeVisibleByXpath("//*[@id=\"div_legend_pim_employee_distribution_legend\"]/table/tbody/tr[3]/td[2]", driver);
		ActionsList.webElementToBeVisibleByXpath("//*[@id=\"div_legend_pim_employee_distribution_legend\"]/table/tbody/tr[4]/td[2]", driver);
		System.out.println("All Dashboard Legends are Verified");
		Assert.assertTrue(true);
	}

}
