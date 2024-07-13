package Automation;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.LogInPage;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		
		//Initialize WebDriver
		WebDriver driver = new ChromeDriver(); 
		
//		//Open the login page
//		driver.get("https://www.facebook.com");
//		
//		//Create an instance of LoginPage
//		LogInPage loginPage = new LogInPage(driver);
//		loginPage.enterUsername("LPU@123");
//		loginPage.enterPassword("123456");
//		loginPage.clickLoginButton();
//		
//		
//		//Close the browser
//		driver.quit();
		//-------------------------------------------------------------------------------------------------
//		driver.get("https://demo.automationtesting.in/Alerts.html");
//		
//		WebElement ClickAlertbox = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		
//		ClickAlertbox.click();
//		Thread.sleep(5000);
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
//		driver.switchTo().frame(9); // ---> by index
//		
//		driver.switchTo().frame("frame"); // by string
//		
//		driver.switchTo().frame(ClickAlertbox);  //by locators
//		
//		driver.switchTo().parentFrame();   //for parent frame
//		
//		driver.switchTo().defaultContent();  //for main page
//		
		
		//--------------------------------------------------------------------------
		
		
		String TabId = driver.getWindowHandle();
		
		System.out.println(TabId);
		
		WebElement al = driver.findElement(By.xpath("//span[.='Google']"));
		
		Set<String> pageId = driver.getWindowHandles();
		
		System.out.println(pageId);
		
	}
}
