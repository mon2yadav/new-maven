package testingbaba_test;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Aaaj_ki_practise extends Baseliberary{
	
	public void takescreenshot()
	{
	try{
    TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String screenshotName=null;
	File dest=new File("./screenshot"+screenshotName+"./PNG");
	Files.copy(src,dest);
	}
	catch(Exception e){
	System.out.println("Issue in take screenshot");
	}
	
	}

	public void getlounch(String url)
	{
	System.setProperty("webdriver.chrome.driver","");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public void doubleclick()
	{
	Actions act=new Actions(driver);
	act.doubleClick().perform();

	Actions act1=new Actions(driver);
	act1.contextClick().perform();

	Actions act2=new Actions(driver);
	act2.moveToElement(null).build().perform();
	}

	public void somedrivermethod()
	{
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).clear();
	driver.findElement(By.xpath("")).sendKeys("montu");
//	driver.findElement(By.xpath("")).sendkeys(keys.ENTER);
//	driver.findElement(By.xpath(""))sendkeys(keys.F5);
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.navigate().back();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	driver.switchTo().alert().getText();
	driver.switchTo().frame("{frameName/frameId/frameIndex}");
	driver.switchTo().defaultContent();
	}

	public void changewindow(int tabindex)
	{
	Set<String> tab=driver.getWindowHandles();
	ArrayList<String> tabs=new ArrayList<String>(tab);
	driver.switchTo().window(tabs.get(tabindex));
	}

	public void dynamicwait()
	{
	WebDriverWait wait=new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
	}
	 public void dropdownbyvalue(WebElement ele, String value)
	{
	Select sel=new Select(ele);
	sel.selectByVisibleText(value);
	}

	public String getcurrentdateandtime()
	{
	String datetime = null;
	try{
	DateFormat df=new SimpleDateFormat("dd-mm-yyyy  hh:mm");
	Date dateobj=new Date(11);
	df.format(dateobj);
	datetime=df.format(dateobj);
	return datetime;
	}
	catch(Exception e){
	System.out.println("issue in get current date and time");
	}
	return datetime;
	}


	public void scrollbyxpath()
	{
	try{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("",(By.xpath("")));
	}
	catch(Exception e){
	System.out.println("Issue in scrollby xapth");
	}
	}
	

	public static String propertyutility(String key)
	{
	String path="";
	String value="";
	try{
	FileInputStream fis=new FileInputStream(path);
	Properties prop=new Properties();
	prop.load(fis);
	value=prop.getProperty(key).trim();
	return value;
	}
	catch(Exception e)
	{
	System.out.println("Issue in read the data through propertiutility");
	}
	return value;
	}

	public void chekcbrokenlink()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.crptoknowmics.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	List<WebElement> counts=driver.findElements(By.tagName("a"));
	System.out.println("No. of links "+counts.size());
	ArrayList<String> urlList=new ArrayList<String>();
	for(WebElement e:counts)
	{
	String url=e.getAttribute("href");
	System.out.println(urlList.add(url));
	checkbrokenlink(url);
	}
	driver.quit();
	}
	public static void checkbrokenlink(String urlList)
	{
	try{
	URL urls=new URL(urlList);
	HttpURLConnection httpcon=(HttpURLConnection)urls.openConnection();
	httpcon.setConnectTimeout(5000);
	httpcon.connect();
	if(httpcon.getResponseCode()>=400)
	{
	System.out.println(urlList+httpcon.getResponseMessage()+"This link is broken");
	}
	else
	{
	System.out.println(urlList+httpcon.getResponseMessage()+"This link is not broken");
	}
	}
	catch(Exception e)
	{
		System.out.println("Issue in checkbroken link  "+e);
	}
	}




}
