package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.LoginPage;
import utilities.BaseTest;
import utilities.ExtentManager;
import utilities.ScreenshotUtil;

public class LoginAutomationTest extends BaseTest {

    @Test
    public void invalidLoginTest() throws InterruptedException {

        ExtentReports extent = ExtentManager.getReportObject();
        ExtentTest test = extent.createTest("Invalid Login Test");

        launchBrowser();
        test.info("Browser launched");

        driver.get("https://demowebshop.tricentis.com/login");
        test.info("Login page opened");

        LoginPage login = new LoginPage(driver);

        login.enterEmail("test@gmail.com");
        test.info("Email entered");

        login.enterPassword("123456");
        test.info("Password entered");

        login.clickLogin();
        test.info("Login button clicked");

        String errorMessage = login.getErrorMessage();

        try {
            Assert.assertTrue(errorMessage.contains("Login was unsuccessful"));

            test.pass("Invalid login error message verified successfully");

        } catch (AssertionError e) {

            ScreenshotUtil.captureScreenshot(driver, "LoginFailure");

            test.fail("Test failed. Screenshot captured.");

            throw e;

        } finally {

            Thread.sleep(3000);

            closeBrowser();
            test.info("Browser closed");

            extent.flush();
        }
    }
}