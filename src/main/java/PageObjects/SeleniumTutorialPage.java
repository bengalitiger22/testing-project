package PageObjects;

import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class SeleniumTutorialPage extends BasePage {
	
	public SeleniumTutorialPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyURLName() {
		SwitchToNewWindows();
		if (GetUrlOfCurrentPage().contains("selenium")) {

			return true;

		}

		return false;
	}

}
