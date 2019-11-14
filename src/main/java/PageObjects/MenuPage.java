package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class MenuPage extends BasePage {
	
	//By menu = By.xpath(xpathExpression);

	public MenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void ClickOnMenu(String menuname) throws InterruptedException {
		Thread.sleep(5000);
		//driver.findelement(by.sdfs).click();
		Click(By.xpath("//*[@id='cssmenu']//a[text()='"+menuname+"']"));
		
	}

}
