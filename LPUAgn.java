package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LPUAgn {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bikewale.com");
		driver.manage().window().maximize();
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Title = driver.getTitle();
		System.out.println(Title);
		WebElement location = driver.findElement(By.xpath("(//*[@fill='currentcolor'])[2]"));
		location.click();
		WebElement LocationSearch = driver.findElement(By.xpath("(//*[@placeholder='Type your Pincode or City'])"));
		LocationSearch.sendKeys("jalandhar");
		LocationSearch.click();
		Thread.sleep(3000);
		WebElement listItem = driver.findElement(By.xpath("(//*[contains(@data-payload, 'Jalandhar, Punjab')])"));
		listItem.click();
		Thread.sleep(3000);
		WebElement TVS = driver.findElement(By.xpath("//*[@title='TVS']"));
		TVS.click();
		
	}
}
