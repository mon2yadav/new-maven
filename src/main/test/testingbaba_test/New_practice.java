package testingbaba_test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import baseliberary.Baseliberary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_practice extends Baseliberary {

	public static void getscreenshot()
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String screenshotName=null;
			File dest=new File("./screenhot"+screenshotName+"./PNG");
			Files.copy(src, dest);
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in takescreenshot  "+e);
		}
	}
	
	public void getlounchdriver(String url)
	{
		System.setProperty("webdriver.chrome.driver", "");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	public void doubleclick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
		act.contextClick().perform();
		act.moveToElement(ele);
	}
	
	public void drivermethod(String url)
	{
		driver.getTitle();
		driver.get(url);
		driver.switchTo().alert().getText();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys("montu");
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("")).sendKeys(Keys.F5);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().frame("{frameindex/framename/framemethod}");
		
		
	}
	
	public void changewindow(int tabindex)
	{
		Set<String> tab=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<String>(tab);
		driver.switchTo().window(tabs.get(tabindex));
		
		driver.switchTo().defaultContent();
	}
	
	public void scrollbyxpath( )
	{
		try {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("",By.xpath(""));
		} catch (Exception e) {
			System.out.println("issue in scroll by xpath  "+e);
		}
	}
	
	public void dynamicwait()
	{
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	
	public void dropdownbyvalue(WebElement ele, String value)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
	}
	
	public String getcurrentdateandtime()
	{
		String datetime=null;
		try {
			DateFormat df=new SimpleDateFormat("dd-mm-yyyy ,hh:mm");
			Date dateobj=new Date(12);
			df.format(dateobj);
			datetime=df.format(dateobj);
			return datetime;
		} catch (Exception e) {
			System.out.println("issue in takecurrentdateandtime   "+e);
		}
		return datetime;
		
	}
	
	public static String propertyutility()
	{
		String path="";
		String value="";
		try {
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(value);
		return value;
		} catch (Exception e) {
			System.out.println("issue in getdata  "+e);
		}
		return value;
	}
}
