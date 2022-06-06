package brokenlink_utility;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseliberary.Baseliberary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink_practice extends Baseliberary {
	
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.cryptoknowmics.com");
		driver.manage().window().maximize();
		List<WebElement> counts=driver.findElements(By.tagName("a"));
		System.out.println("NO. of links"+counts.size());
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
				System.out.println(urlList  + httpcon.getResponseMessage() + " This link is Broken ");
			}
			else
			{
				System.out.println(urlList + httpcon.getResponseMessage()+ " This link iS not Broken" );
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}
