package waitutility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseliberary.Baseliberary;

public class waitutility extends Baseliberary {
	public static void visibilityofelement(int time , WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	public static void alertispresent(int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
		
//		driver.manage().timeouts().setScriptTimeout(time,TimeUnit.SECONDS);
		
//		try 
//		{
//	    wait.wait(2000);		
//		} catch (Exception e) 
//		{
//			
//		}
	}

	public static void fluentwait(WebElement ele)
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).
		withTimeout(10,TimeUnit.SECONDS).
		pollingEvery(3,TimeUnit.SECONDS).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	}


