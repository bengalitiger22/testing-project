package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class WayToAutomationHomePage extends BasePage {

	String window;
	public WayToAutomationHomePage(WebDriver driver) {
		super(driver);

	}
	public void clickOnBuyNow() {
		window = GetCurrentWindowID();
		click(By.xpath("//*[@id='wrapper']/header/div[2]/div/div[2]/div/a[2]"));
	}

	public boolean VerifyURLofHomePage() {
		SwitchToParentWindow(window);
		if (GetUrlOfCurrentPage().contains("automation")) {

			return true;

		}

		return false;
	}
}
