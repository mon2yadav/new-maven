package baseliberary;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseliberary1 {





		public static WebDriver driver=null;
		public void getlaunch(String URL)
		{
//			System.setProperty("WebDriver.chrome.driver ","C:\\Users\\hp\\eclipse-workspace\\30dec_Automationfor_matic\\driver\\chromedriver.exe" );
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.get(URL);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
		}
	}


