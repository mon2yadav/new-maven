package baseliberary;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import screenshot.Screenshot;

public class Baseliberary {
	public static WebDriver driver=null;
		 String closebtn="//*[text()='×']";
		  String practice="//*[text()='Practice']";
		public void getlaunch(String url)
		{
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\30dec_Automationfor_matic\\driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
		    driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
	        public void clickonclosebtn()
	     {
		   driver.findElement(By.xpath(closebtn)).click();
		   driver.findElement(By.xpath(practice)).click();	
	     }
		   @AfterTest
		   public void teardown()
		{
//			driver.quit();
			
		}
//		   @AfterMethod
//		   public 	void getresultanalysis(ITestResult result)
//		   {
//			   String methodname=result.getMethod().getMethodName();
//			   if(result.isSuccess())
//			   {
//				   Screenshot.getscreenshot("passed", methodname);
//			   }
//			   else if(result.getStatus()==ITestResult.FAILURE)
//			   {
//				   Screenshot.getscreenshot("failed", methodname);
//			   }
//			   else if(result.getStatus()==ITestResult.SKIP)
//			   {
//				   Screenshot.getscreenshot("skipped", methodname);
//			   }
//		   }
	}


