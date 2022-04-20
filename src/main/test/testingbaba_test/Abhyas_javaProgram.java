package testingbaba_test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;
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

import java.net.HttpURLConnection;
import java.net.URL;
import com.google.common.io.Files;

import baseliberary.Baseliberary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Abhyas_javaProgram extends Baseliberary {

	
	public void screenshot() {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sre=ts.getScreenshotAs(OutputType.FILE);
			String screenshotName=null;
			File dest=new File("./screenshot"+screenshotName+"./PNG");
			Files.copy(sre, dest);
			
		} catch (Exception e) {
			System.out.println("Issue in takescreenhsot  "+e);
		}
	}
	
	public void driverlounch(String url) {
		System.setProperty("webdriver.chrome.driver","");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	
	public void doubleclick(WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
		
		Actions act1=new Actions(driver);
		act1.contextClick().perform();
		
		Actions act2=new Actions(driver);
		act2.moveToElement(ele).build().perform();
		
		act2.dragAndDrop(ele, ele);
	}
	
	public void somedrivermethod() {
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).sendKeys("montu");
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("")).sendKeys(Keys.F5);
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().frame("{frameName/frameId/frameIndex}");
		driver.switchTo().defaultContent();
		
	}
	
	public void changewindow(int tabindex) {
		Set<String> tab=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<String>(tab);
		driver.switchTo().window(tabs.get(tabindex));
		
	}
	
	public void dynamicwait() {
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
	}
	
	public void dropdowmbyvalue(WebElement ele, String value) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
	}
	public String getcurrentdate() {
		String datetime=null;
		try {
			DateFormat df=new SimpleDateFormat("dd-mm-yyyy  hh:mm");
			Date dateobj=new Date(11);
			df.format(dateobj);
			datetime=df.format(dateobj);
			return datetime;
			
			
		} catch (Exception e) {
			System.out.println("issue in getcurrent date and time  "+e);
		}
		return datetime;
	}
	
	public void scrollbyxpath() {
		try {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("",By.xpath(""));
		} catch (Exception e) {
			System.out.println(" issue in scroolby xpath  "+e);
		}
		
	}
	
	public static String propertyutility(String key)
	{
		String path="";
		String value="";
		try {
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key).trim();
			
		} catch (Exception e) {
			System.out.println("Issue in getdata");
		}
		return value;
	}
	
	public static void checkbrokenlink() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.cryptoknowmics.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> counts=driver.findElements(By.tagName("a"));
		System.out.println("Number of links "+counts.size());
		ArrayList<String> urlList=new ArrayList<String>();
		for(WebElement e:counts)
		{
			String url=e.getAttribute("href");
			System.out.println(urlList.add(url));
			checkBrokenLink(url);
		}
		driver.quit();
			
			
		}
	

	private static void checkBrokenLink(String urlList) {
		try {
			URL urls=new URL(urlList);
			HttpURLConnection httpcon=(HttpURLConnection)urls.openConnection();
			httpcon.setConnectTimeout(5000);
			httpcon.connect();
			if(httpcon.getResponseCode()>=400)
			{
				System.out.println(urlList+httpcon.getResponseMessage()+"This link is borken");
				
			}
			else
			{
				System.out.println(urlList+httpcon.getResponseMessage()+"This link is not broken");
			}
			
			
		} catch (Exception e) {
			System.out.println(" issue in check broken linke   "+e);
		}
		
	}
	
	public int randomnumber() {
		int randomNumber=0;
		try {
			Random objgenerator=new Random();
			for(int i=0; i<10; i++)
			{
				randomNumber=objgenerator.nextInt(1000);
			}
			
		} catch (Exception e) {
			System.out.println("Issue in get randomnumber  "+e);
		}
		return randomNumber;
	}
	
	public void uploadfilewithrobot(String imagepath) {
		StringSelection stringselection=new StringSelection(imagepath);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringselection, null);
		Robot robot=null;
		try {
			robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(150);
			
		} catch (Exception e) {
			System.out.println("   "+e);
		}
		
	}
	
	
}
