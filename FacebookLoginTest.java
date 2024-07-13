package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Facebook.LogInPage;

public class FacebookLoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUpMethod() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test (priority = 1)
	public void testValidLogin() {
		LogInPage Lp= new LogInPage(driver); 
		Lp.enterUsername();
		Lp.enterPassword();
		Lp.clickLoginButton();
	}
	
	@Test (priority = 2, /*invocationCount = 3, dependsOnMethods = {"Test B", "Test A"}, enabled = false,*/ timeOut=5000)
	public void tsValidLogin() {
		LogInPage Lp= new LogInPage(driver);
		Lp.enterUsername();
		Lp.enterPassword();
		Lp.clickLoginButton();
	}
	
	@AfterMethod
	public void tearDownMethod() {
		driver.quit();
	}
	
}
