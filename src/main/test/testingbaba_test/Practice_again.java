package testingbaba_test;

import java.io.File;
import java.util.ArrayList;
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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import baseliberary.Baseliberary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_again extends Baseliberary {

	

	public static void getluch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame("");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys("montu");
		driver.getTitle();
		driver.get(url);
		driver.close();
		driver.quit();
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String screenshotName=null;
			File dest=new File("./screenshot"+screenshotName+".PNG");
			Files.copy(src, dest);
			
			
		} catch (Exception e) {
			System.out.println("Issue in take screenshot  "+e);
		}
		
	}
	public void doubleclick()
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	public void rightclick() {
		Actions act1=new Actions(driver);
		act1.contextClick();
		
	}
	public void switchtab()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
	}
	public void changewindow(int tabindex)
	{
		Set<String> tab=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<String>(tab);
		driver.switchTo().window(tabs.get(tabindex));
	}
	public void scrollxpath()
	{
		try {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript(null, null);
		} catch (Exception e) {
			System.out.println(" issue in scrollbexpath  "+e);
		}
		
	}
	public void dynamicwait()
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 200);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
	} 
		catch (Exception e) {
		System.out.println("issue in dynamic wait");
	}
	
			
	}
	
	public static void dropdownbyvalue(WebElement ele, String value)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
	}
	public void moveforward()
	{
		driver.navigate().forward();
	}
	public void movebackword()
	{
		driver.navigate().back();
	}
	public void refreshbrowser()
	{
		driver.navigate().refresh();                                      // for refresh the browser
		driver.findElement(By.xpath("")).sendKeys(Keys.F5);                //  for refresh the browser
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);                      // for send data and press enter
	}
}
