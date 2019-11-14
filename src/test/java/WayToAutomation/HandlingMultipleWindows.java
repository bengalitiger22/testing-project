package WayToAutomation;

import org.testng.Assert;
import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import PageObjects.SeleniumTutorialPage;
import PageObjects.WayToAutomationHomePage;
import coreClasses.BaseTest;

public class HandlingMultipleWindows extends BaseTest {
	
	private static final Logger LOGGER = Logger.getLogger(HandlingMultipleWindows.class);
	@Test
	public void VerifyBuyNowTitle() throws InterruptedException {

		WayToAutomationHomePage WayToAutomationHomepage = new WayToAutomationHomePage(BaseTest.driver);
		SeleniumTutorialPage SeleniumTutorialPage= new SeleniumTutorialPage(BaseTest.driver);
		WayToAutomationHomepage.clickOnBuyNow();

		Thread.sleep(2000);

		if (SeleniumTutorialPage.verifyURLName()) {
			//System.out.println("test case pass");
			LOGGER.info("test case pass");
		} else {
			//System.out.println("test case fail, user not redirected to buynowpage");
			LOGGER.info("test case pass");
			Assert.assertTrue(false);

		}
		Thread.sleep(2000);
		if (WayToAutomationHomepage.VerifyURLofHomePage()) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail, user not redirected to Homepage");

			Assert.assertTrue(false);

		}
		
		
	}
}