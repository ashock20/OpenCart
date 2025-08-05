package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	//constructor
	public RegistrationPage(WebDriver driver){
		super(driver);	
		
	}
	
	
	
	// locator
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconform;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chAgree;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement ckContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	 
	
	// action methods
	
	public  void setFirstName(String fname) {
		txtfirstname.sendKeys(fname);
		
	}
	
	public void setLastName(String lname) {
		
		txtlastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		
		txtemail.sendKeys(email);
		
	}
	public void settelephone(String phone) {
		txttelephone.sendKeys(phone);
	}

	public void setpassword(String pws) {
		
		txtpassword.sendKeys(pws);
		
	}
	public void setconfirm(String pws) {
		txtconform.sendKeys(pws);
	}
	public void checkAgree() {
		chAgree.click();
	}
	
	public void clickContinue() {
		ckContinue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}

	
	
}
