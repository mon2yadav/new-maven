package extendreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extendreport_utility {

	public class Extendreport {

		ExtentReports extent;

		@BeforeTest
		public void ExtentsNg1() {
			String path = System.getProperty("user.dir") + "\\reporters\\index.html";
			ExtentSparkReporter reporters = new ExtentSparkReporter(path);
			reporters.config().setReportName("Web Automation Results");
			reporters.config().setDocumentTitle("Test Result");

			extent = new ExtentReports();
			extent.attachReporter(reporters);
			extent.setSystemInfo("Tester", "Montu yadav");
		}

		@Test
		public void launchreports() {
			extent.createTest("launchreports");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://cryptoknowmics.com");
			System.out.println(driver.getTitle());
			extent.flush();
		}

	}

}
