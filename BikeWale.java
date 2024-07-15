package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BikeWale {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bikewale.com");
		driver.manage().window().maximize();
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.xpath("(//*[@fill='currentcolor'])[2]"));
		location.click();
		
		Thread.sleep(2000);
		
		WebElement LocationSearch = driver.findElement(By.xpath("(//*[@placeholder='Type your Pincode or City'])"));
		LocationSearch.sendKeys("jalandhar");
		LocationSearch.click();
		
		Thread.sleep(3000);
		
		WebElement listItem = driver.findElement(By.xpath("(//*[contains(@data-payload, 'Jalandhar, Punjab')])"));
		listItem.click();
		
		Thread.sleep(3000);
		
		WebElement listItem1 = driver.findElement(By.xpath("(//*[contains(@data-payload, '144102')])"));
		listItem1.click();
		
		Thread.sleep(4000);
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,800)");
        
        Thread.sleep(2000);
		
		WebElement TVS = driver.findElement(By.xpath("//*[@title='TVS']"));
		TVS.click();
		
		Thread.sleep(3000);
		
		WebElement topComparisons = driver.findElement(By.xpath("(//*[@title='TVS Top Comparisons'])[2]"));
		topComparisons.click();
		
		Thread.sleep(3000);
		
		WebElement reviews = driver.findElement(By.xpath("(//*[@title='TVS Reviews'])[1]"));
		reviews.click();
		
		Thread.sleep(3000);
		
		WebElement homeMenu = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/header/div/div[1]/div/span"));
		homeMenu.click();
		
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/div/div/nav/ul/li[1]/div/div/a/span"));
		home.click();
		
		Thread.sleep(3000);
		
		WebElement homeMenu1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/header/div/div[1]/div/span"));
		homeMenu1.click();
		
		Thread.sleep(3000);
		
		WebElement newBikes = driver.findElement(By.xpath("//span[text()='New Bikes']"));
		newBikes.click();
		
		Thread.sleep(3000);
		
		WebElement newLaunches = driver.findElement(By.xpath("//span[text()='New Launches']"));
		newLaunches.click();
		
		Thread.sleep(3000);
		
		WebElement clickBikeWale = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/header/div/div[1]/div/a"));
		clickBikeWale.click();
		
		Thread.sleep(3000);
		
		jsExecutor.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(3000);
		
		WebElement bodyStyle = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/section/div/div/div[1]/div/ul/li[4]/div/span"));
		bodyStyle.click();
		
		Thread.sleep(3000);
		
		WebElement cruiser = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/section/div/div/div[2]/div[4]/div/div/ul/li[3]/a/div[2]"));
		cruiser.click();
		
		WebElement selectAnyBike = driver.findElement(By.xpath("//span[text()='BMW R 12']"));
		selectAnyBike.click();
		
		
	}
}
