package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//constructor
	
	public HomePage(WebDriver driver){
		super(driver);	
		
	}
	// locator
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	
	// login test
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement chklogin;
	
	//Action methods
	
	
	public void clickMyAccount() {
		
		myAccount.click();
		
	}
	
	public void clickRegister() {
		
		register.click();
	}

	public void clickLogin() {
		chklogin.click();
		
	}
	
}
