package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LumaDemoStore {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		String expectedUrl = "https://magento.softwaretestingboard.com/";
        String actualUrl = driver.getCurrentUrl();
        if (!actualUrl.equals(expectedUrl)) {
            System.out.println("Test Failed: Incorrect URL");
            driver.quit();
            return;
        }
        System.out.println("URL: " + actualUrl);
        
        String pageTitle = driver.getTitle();
        System.out.println("Title: " + pageTitle);
        
        Thread.sleep(1000);
        
        WebElement menLink = driver.findElement(By.linkText("Men"));
        menLink.click();
        
        Thread.sleep(1000);
        
        WebElement topsLink = driver.findElement(By.linkText("Tops"));
        topsLink.click();
        
        //Thread.sleep(9000);
        
//        WebElement jacketsLink = driver.findElement(By.linkText("Jackets"));
//        jacketsLink.click();
        
        Thread.sleep(1000);
        
        WebElement catogery = driver.findElement(By.linkText("Catogery"));
        catogery.click();
        
        Thread.sleep(4000);
        
        WebElement hoodiesAndSweatshirts = driver.findElement(By.linkText("Hoodies & Sweatshirts"));
        hoodiesAndSweatshirts.click();
        
        
        
		
	}
}
