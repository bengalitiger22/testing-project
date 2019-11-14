package Register;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.MenuPage;
import PageObjects.RegistrationPage;
import coreClasses.BaseTest;

public class SuccessfulRegistrationTest extends BaseTest{
	
	@Test
	public void verifyRegistration() throws InterruptedException {
		
		MenuPage menupage= new MenuPage(BaseTest.driver);
		
		menupage.ClickOnMenu("Register");
		
		RegistrationPage registrationpage = new RegistrationPage(BaseTest.driver);
		
		registrationpage.FillPersonalInfo();
		
		Assert.assertTrue(registrationpage.VerifyTitleAndUrl(),"");
		
		
	}

}

/*
1)Open Google Chrome
2)Open Test.Textingpro website.
3)Click on Register menu
4)Verify use is on register page.
5)Fill personal info fields.
Fill personal contact details fields
Fill passwords fields
Select all dropdown
Click on termandconditioncheckbox
Click on register button
User should be able to register successfully.*/

