package Automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
//		WebElement username = driver.findElement(By.id("email"));
//		
//		username.sendKeys("Lpu@123");
//		
//		WebElement password = driver.findElement(By.name("pass"));
//		
//		password.sendKeys("1234567");
//		
//		WebElement login = driver.findElement(By.tagName("button"));
//		
//		Boolean result = login.isEnabled();
//		System.out.println(result);
//		
//		Dimension d = new Dimension(700, 500);
//		driver.manage().window().setSize(d);
//		
//		Point p = new Point(1000,500);
//		driver.manage().window().setPosition(p);
//		
//		WebElement CreateAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		CreateAccount.click();
//		
//		Thread.sleep(5000);
//		
//		WebElement MaleRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//
//		Boolean result1 = MaleRadioButton.isSelected();
//		System.out.println(result1);
//		
//		if(result1 == true) {
//			System.out.println("Button Selected");
//		}
//		else {
//			MaleRadioButton.click();
//		}
//		
//		String Url = driver.getCurrentUrl();
//		System.out.println(Url);
//		
//		WebElement listBox = driver.findElement(By.xpath("//select[@id='day']"));
//		
//		Select s = new Select(listBox);
//		
//		s.selectByIndex(7);
//		
//		Thread.sleep(5000);
//		
//		s.selectByValue("12");
//		
//		Thread.sleep(5000);
//		
//		s.selectByVisibleText("25");
//		
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		
//		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//		
//		FileHandler.copy(srcFile, new File("C:\\Users\\akash\\Pictures\\test123.jpg"));
//		
//		WebElement login1 = driver.findElement(By.xpath("//button[@type='submit']"));
//		
//		Actions act = new Actions(driver);
//		
//		act.click(login1).perform();
//		
//		act.contextClick(login1).perform();
//		
//		act.click(login1);
		
		
//		WebElement  electronics = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[4]"));
//		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(electronics).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)"); // --> Scroll Down
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500)"); // --> Scroll up
		
	}
}
