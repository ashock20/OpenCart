package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginPage extends BaseClass {
	
	@Test(groups= {"regression","master"})
	void validate_login() {
		
		logger.info("***** start login procerss*****");
		try {
		
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email1"));
		lp.setPassword(p.getProperty("password1"));
		lp.clickonLogin();
		
		MyAccountPage ap=new MyAccountPage(driver);
		boolean vd=ap.isMyAccountPageExists();
		
		Assert.assertTrue(vd);
		}
		catch(Exception e){
			Assert.fail();
		}
		
		logger.info("******loing end**************");
	}
	
	

}
