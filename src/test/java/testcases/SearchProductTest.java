package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchProductTest() throws InterruptedException {

        launchBrowser();

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("input[value='Search']")).click();

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Search URL: " + currentUrl);

        Assert.assertTrue(currentUrl.contains("search"));

        Thread.sleep(3000);

        closeBrowser();
    }
}