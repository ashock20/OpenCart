package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass{
   
	
	@Test(groups= {"sanity","master"})
	void account_registration_test() throws InterruptedException {
		
		 
		try {
		logger.info("******loger message start *******");
		HomePage hp=new HomePage(driver);
		logger.info("******click account *******");
		Thread.sleep(3000);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegistrationPage rpage=new RegistrationPage(driver);
		
		Thread.sleep(3000);
		logger.info("******enter details*******");
		rpage.setFirstName(randomeString());
		rpage.setLastName(randomeString());
		rpage.setEmail(randomeString()+"@gmail.com");
		rpage.settelephone(randomeNumber());
		
		logger.info("******enter password*******");
		String password=randomAlphaNumeric();
		rpage.setpassword(password);
		rpage.setconfirm(password);
		rpage.checkAgree();
		rpage.clickContinue();
		logger.info("******validate message *******");
		
		
		String conform=rpage.getConfirmationMsg();
		
		Assert.assertEquals(conform, "Your Account Has Been Created!");
	}
		catch(Exception e) {
			logger.error("****test case fail******");
			logger.debug("*****debug message***");
			Assert.fail();
		}
	}
	
	
	
	

	
}
