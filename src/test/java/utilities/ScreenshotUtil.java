package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String fileName) {

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File dest = new File("screenshots/" + fileName + ".png");

        try {
            Files.copy(src.toPath(), dest.toPath());

            System.out.println("Screenshot saved successfully");

        } catch (IOException e) {

            System.out.println("Screenshot failed");

            e.printStackTrace();
        }
    }
}