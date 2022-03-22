package testingbaba_test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import baseliberary.Baseliberary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice extends Baseliberary {
	
	private static final String Output = null;

	public static void takescreenshot() throws Exception
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String screenshotName= null;
			File dest=new File("./screenshot "+screenshotName+".PNG");
			Files.copy(src,dest);	
		} catch (Exception e) {
			System.out.println("Issue in takescreenshot   "+e);
		}
		
		
	}
	
	public void getlounch()
	{
		System.setProperty("", "");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(Output);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();             //for click
		driver.findElement(By.xpath("//button[text()='Confirm']")).clear();                    //for clear
		driver.findElement(By.xpath("//button[text()='Confirm']")).sendKeys("montu yadav");    // for send the data
		driver.close();                                                                          //for close the current tab
		driver.quit();                                                                           // for close the all web page
		
		
		
	}
	
	public void doubleclick()
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	public void rightclick()
	{
		Actions act1=new Actions(driver);
		act1.contextClick().perform();
	}
	
	public void changewindow(int tabindex)
	{
		Set<String> tab=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<String>(tab);
		driver.switchTo().window(tabs.get(tabindex));
		
		
		
		driver.switchTo().defaultContent();                                                             // for tab switch
		driver.switchTo().frame("{frameindex/frameid/frameName}");                                     // for switch the frmae
		
		driver.switchTo().alert().accept();                                                               // for accept the alert
		driver.switchTo().alert().dismiss();                                                                // for cancle the alert
		driver.switchTo().alert().getText();                                                               // for retrive the text
		driver.switchTo().alert().sendKeys("montu yadav");                                                // for send data in alertbox
	}
	
	public void scrollbyxpath(WebElement xpath)
	{
		try {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("argument[0].scrollIntoView(True);", xpath);
		} catch (Exception e) {
			System.out.println("issue in scroll by xpath  "+e);
		}
	}

}
