package utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtil {

	public static String capture(WebDriver driver, String testName) {

		try {

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String path = "screenshots/" + testName + ".png";

			File dest = new File(path);

			FileUtils.copyFile(src, dest);

			return path;

		} catch (Exception e) {

			return e.getMessage();
		}
	}
}
