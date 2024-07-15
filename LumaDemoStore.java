package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        
        WebElement menMenu = driver.findElement(By.linkText("Men"));
        menMenu.click();
        
        Thread.sleep(1000);
        
        WebElement topsMenu = driver.findElement(By.linkText("Tops"));
        topsMenu.click();
        
//        Thread.sleep(1000);
//        
//        WebElement jacketsLink = driver.findElement(By.xpath("//*[@id='ui-id-19']"));
//        jacketsLink.click();
//        
        Thread.sleep(2000);
        
        WebElement category = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[1]"));
        category.click();
        
        Thread.sleep(2000);
        
        WebElement hoodiesAndSweatshirts = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[2]/a"));
        hoodiesAndSweatshirts.click();
        
        Thread.sleep(6000);

        WebElement price = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[10]"));
        price.click();

        WebElement priceFilter = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[10]/div[2]/ol/li[2]/a"));
        priceFilter.click();

        Thread.sleep(2000);

        WebElement selectHoodie = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
        selectHoodie.click();

        Thread.sleep(6000);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,450)");

        Thread.sleep(6000);
 
        WebElement sizeXL = driver.findElement(By.xpath("//*[@id='option-label-size-143-item-170']"));
        sizeXL.click();

        Thread.sleep(2000);

        WebElement colorBlack = driver.findElement(By.xpath("//*[@id='option-label-color-93-item-49']"));
        colorBlack.click();

        Thread.sleep(6000);

        WebElement addToCartButton = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
        addToCartButton.click();

        Thread.sleep(6000);

        WebElement goToCartButton = driver.findElement(By.xpath("//a[@class='action showcart']"));
        goToCartButton.click();

        WebElement veiwCart= driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span"));
        veiwCart.click();

        Thread.sleep(6000);
        
        jsExecutor.executeScript("window.scrollBy(0,500)");

        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button"));
        proceedToCheckout.click();

        Thread.sleep(6000);

        WebElement emailAddress = driver.findElement(By.xpath("//*[@id='customer-email']"));
        emailAddress.sendKeys("arshsinghpatel1458@gmail.com");
        
        Thread.sleep(10000);

        WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input"));
        firstName.sendKeys("Arsh");
        
        Thread.sleep(2000);

        WebElement lastName = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input"));
        lastName.sendKeys("Singh");
        
        Thread.sleep(2000);

        WebElement company = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input"));
        company.sendKeys("Abcdefgh");
        
        Thread.sleep(2000);
        
        WebElement streetAddress = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input"));
        streetAddress.sendKeys("Patna Sahib, Patna");
        
        Thread.sleep(2000);

        WebElement city = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input"));
        city.sendKeys("XYZ");

        Thread.sleep(2000);
        
        WebElement stateOrProvince = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select"));
        Select state = new Select(stateOrProvince);
        state.selectByIndex(7);

        Thread.sleep(2000);

        WebElement zipOrPostalcode = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input"));
        zipOrPostalcode.sendKeys("111111");

        WebElement country = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select"));
        Select countryName = new Select(country);
        countryName.selectByIndex(2);

        Thread.sleep(2000);

        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input"));
        phoneNumber.sendKeys("8888888888");
        
        Thread.sleep(4000);
        
        WebElement radioButton = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input"));
        radioButton.click();
        
        WebElement nextButton = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        nextButton.click();

        Thread.sleep(8000);
        
        WebElement placeOrder = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        placeOrder.click();

        
        
        
        
		
	}
}
