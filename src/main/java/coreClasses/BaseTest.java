package coreClasses;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		
		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bengalitiger\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://test.textingpro.com/");
		driver.get("http://www.way2automation.com");
}
	@AfterTest
	public void closebrowser() {
		driver.close();
		driver.quit();
	}
	
}