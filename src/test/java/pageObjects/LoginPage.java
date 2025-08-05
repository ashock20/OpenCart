package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver){
		
		super(driver);
		
	}
	// locatords for login page 
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginto;
	
	// Action Methods
	
	public void setEmail(String eml) {
		
		email.sendKeys(eml);
	}

	public void setPassword(String pws) {
		
		password.sendKeys(pws);
	}
	public void clickonLogin() {
		loginto.click();
	}
}
