package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {

	// All the locators of page
	@FindBy(xpath = "//*[text()='Login']")
	WebElement txtLoginPage;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(tagName = "button")
	WebElement btnLogin;

	// Initialization of locators/variables
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// methods required to perform test steps

	/*
	 * Author : Madhavendra Dhuriya 
	 * Date : 04 Feb 2023 
	 * Description : This test method is use to verify login page title 
	 * Parameter return : String
	 */

	public String titleOfLoginPage() {
		return txtLoginPage.getText();
	}

	/* Author : Madhavendra Dhuriya 
	 * Date : 04 Feb 2023 
	 * Description : This test method is to verify current url of page
	 */

	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	
	/* Author : Madhavendra Dhuriya 
	 * Date : 04 Feb 2023 
	 * Description : This test method is use to set userNameValue
	 * Parameter return : String
	 */
	
	public void setUserName(String userName) {
		username.sendKeys(userName);
	}
	
	/*Author : Madhavendra Dhuriya 
	 * Date : 04 Feb 2023 
	 * Description : This test method is use to set passwordValue 
	 */
	
	public void setPassword(String password) {
		pass.sendKeys(password);
	}

	/* Author : Madhavendra Dhuriya 
	 * Date : 04 Feb 2023 
	 * Description : This test method is use to click on login button 
	 */

	public void clickLoginBtn() {
		btnLogin.click();
	}
	
	/* Author : Madhavendra Dhuriya 
	 * Date : 04 Feb 2023 
	 * Description : This test method is use to get title of build
	 * Parameter : String
	 */
	
	public String getBuildTitle() {
		return driver.getTitle();
	}
}