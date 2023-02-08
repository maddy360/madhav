package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest {
	
	//All the Locators of Page
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	
	
	
	// Initialization of locators/variables
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*h6[test()='Dashboard']")
	WebElement titleDashboard;
	
	@FindBy(css=".oxd-userdropdown i")
	WebElement clickLogoutDrpDown;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement clickLogoutText;
	
	//all methods on page 
	
	/*
	 * Author : Madhavendra Dhuriya
	 * Date : 04 Feb 2023
	 * Description: This test method is use to verify dashboard page title
	 */

	public String titleOfDashBoardPage() {
		return titleDashBoard.getText();
	}

	public void clickOnLogout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		clickLogoutDrpDown.click();
		clickLogoutText.click();
		
		
	}
}
