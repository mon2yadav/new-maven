package brokenlink_utility;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {
	public static void main(String[] args) throws Throwable {

				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://testingbaba.com/");
	            driver.manage().window().maximize();
	            List<WebElement> counts = driver.findElements(By.tagName("a"));
				System.out.println("No. of links are " + counts.size());
	            List<String> urlList = new ArrayList<String>();
	            for (WebElement e : counts) {
					String url = e.getAttribute("href");
					System.out.println(urlList.add(url));
					checkBrokenLink(url);
				}

				// urlList.parallelStream().forEach((e -> checkBrokenLink(e));
				driver.quit();
			}
	    public static void checkBrokenLink(String urlList) {
				try {
					URL urls = new URL(urlList);
					HttpURLConnection httpcon = (HttpURLConnection) urls.openConnection();
					httpcon.setConnectTimeout(5000);
					httpcon.connect();

					if (httpcon.getResponseCode() >= 400) {
						System.out.println(urlList + " ---> " + httpcon.getResponseMessage() + " Is Broken Link");
					} else {
						System.out.println(urlList + " ---> " + httpcon.getResponseMessage() + " Not Broken Link");
					}
				} catch (Exception e) {

				}

			}

		}





