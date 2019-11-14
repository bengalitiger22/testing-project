package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import coreClasses.BasePage;

public class RegistrationPage extends BasePage{
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public void FillPersonalInfo() {
		
		
		SendKeys(By.id("companyName"),"Randomcompany");
		SendKeys(By.id("firstName"),"Mohammed");
		SendKeys(By.id("lastName"),"Zaman");
		SendKeys(By.id("mobile"),"3476055459");
		SendKeys(By.id("EmailAddree"),"zamanmw@yahoo.com");
		SendKeys(By.id("password"),"swordfish");
		SendKeys(By.id("ConfirmPassword"),"swordfish");
		
	}
	

	public boolean VerifyTitleAndUrl() {
		String Title = GetTitleOfCurrentPage();
		if(Title.contains("register")) {
			return true;
		}
		return false;
	}
	
}