package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class MamaEarth {
	WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://mamaearth.in/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void verifyHomePage() {
        String expectedTitle = "MamaEarth";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Home page title does not contain 'MamaEarth'");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
    }

    @Test(priority = 2)
    public void selectFaceWash() {
        WebElement faceMenu = driver.findElement(By.xpath("//a[text()='Face']"));
        faceMenu.click();
        WebElement faceWashOption = driver.findElement(By.xpath("//a[text()='Face Wash']"));
        faceWashOption.click();

        List<WebElement> faceWashProducts = driver.findElements(By.xpath("//span[text()='Tea Tree Face Wash']"));
        Assert.assertTrue(faceWashProducts.size() > 0, "Tea Tree Face Wash not found");
        faceWashProducts.get(0).click();
    }

    @Test(priority = 3)
    public void selectConditioner() {
        WebElement hairMenu = driver.findElement(By.xpath("//a[text()='Hair']"));
        hairMenu.click();
        WebElement conditionerOption = driver.findElement(By.xpath("//a[text()='Conditioner']"));
        conditionerOption.click();

        List<WebElement> hennaConditioners = driver.findElements(By.xpath("//span[text()='Henna']"));
        Assert.assertTrue(hennaConditioners.size() > 0, "Henna Conditioner not found");
        hennaConditioners.get(0).click();

        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
        addToCartButton.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


