package coreClasses;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	public Alert alert;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void SendKeys(By by, String value) {
		getHighlightElement(driver.findElement(by));
		driver.findElement(by).sendKeys(value);
	}

	private void getHighlightElement(WebElement findElement) {
		// TODO Auto-generated method stub

	}

	public void click(By by) {
		getHighlightElement(driver.findElement(by));
		driver.findElement(by).click();
	}

	public Boolean IsDisplay(By by) {
		getHighlightElement(driver.findElement(by));
		return driver.findElement(by).isDisplayed();
	}

	public String getText(By by) {
		getHighlightElement(driver.findElement(by));
		return driver.findElement(by).getText();

	}

	public void doubleClick(By by) {
		getHighlightElement(driver.findElement(by));
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(by);
		actions.doubleClick(elementLocator).perform();
	}

	public void HitENTER(By by) {
		getHighlightElement(driver.findElement(by));
		driver.findElement(by).sendKeys(Keys.ENTER);

	}

	public void switchTOPopUp() {

		alert = driver.switchTo().alert();

	}

	public String getPopUpText() {
		alert = driver.switchTo().alert();
		// switchTOPopUp();
		String alertText = alert.getText();
		return alertText;

	}

	public String GetUrlOfCurrentPage() {

		return driver.getCurrentUrl();

	}

	public String GetTitleOfCurrentPage() {

		return driver.getTitle();

	}

	public void SwitchToNewWindows() {
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
		}
	}

	public void SwitchToParentWindow(String Window) {
		driver.switchTo().window(Window);
	}

	public String GetCurrentWindowID() {
		String currentwindow = driver.getWindowHandle();
		return currentwindow;
	}

}
