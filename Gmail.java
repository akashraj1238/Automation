package Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement createAccountLink = driver.findElement(By.xpath("//*[text()='Create account']"));
		createAccountLink.click();
		
		Thread.sleep(3000);
		
		WebElement forMyselfOption = driver.findElement(By.xpath("//*[text()='For my personal use']"));
        forMyselfOption.click();
        
        Thread.sleep(3000);
        
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Arsh");
        
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Singh");
        
        Thread.sleep(3000);
        
        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
		
	}
}
