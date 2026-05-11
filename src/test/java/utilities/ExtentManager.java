package utilities;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports getReport() {

		if (extent == null) {

			ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReport.html");
			spark.config().setTheme(Theme.DARK);
			spark.config().setReportName("Automation Execution Report");
			spark.config().setReportName("QA Automation Report");

			extent = new ExtentReports();

			extent.attachReporter(spark);
			extent.setSystemInfo("Project", "SauceDemo Framework");
			extent.setSystemInfo("Tester", "Swamy Dandu");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Environment", "QA");
		}

		return extent;
	}

}
