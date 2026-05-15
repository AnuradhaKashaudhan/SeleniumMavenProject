package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class AddToCartAutomationTest extends BaseTest {

    @Test
    public void addToCartTest() throws InterruptedException {

        launchBrowser();

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.linkText("Books")).click();

        driver.findElement(By.cssSelector("input[value='Add to cart']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("content"))
        ).getText();

        System.out.println("Success Message: " + message);

        Assert.assertTrue(message.contains("The product has been added"));

        Thread.sleep(3000);

        closeBrowser();
    }
}