package applicationutility;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import baseliberary.Baseliberary;

public class Application_utility_my extends Baseliberary{
		public static void clickme(WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();

		}

		public static void senddata(WebElement ele, String value) {
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(value);
		}

		public static void pageloading(int time, By ele) {
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.presenceOfElementLocated(ele));
		}

		public static void doubleclick(WebElement ele) {
//			WebDriverWait wait=new WebDriverWait(driver,2);
//			wait.until(ExpectedConditions.elementToBeClickable(ele));
//			ele.click();
			Actions act = new Actions(driver);
			act.doubleClick(ele).perform();
		}

		public static void rightClick(WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			Actions act = new Actions(driver);
			act.contextClick(ele).perform();
		}

		public static void changewindowtab(int tabindex) {
			Set<String> tab = driver.getWindowHandles();
			ArrayList<String> tabs = new ArrayList<String>(tab);
			driver.switchTo().window(tabs.get(tabindex));

		}

		public static void dropdownbyvalue(WebElement ele, String value) {
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);

		}

		public static void data(WebElement ele, String value) {
			Select sel = new Select(ele);
			sel.getOptions();
		}

		public static void fileupload(String path) {
			try {
				StringSelection selection = new StringSelection(path);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(selection, null);

				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}

			catch (Exception e) {
				System.out.println("Issue in filepload  " + e);

			}
		}

		public static String[] split(String date, String regin) {
			// TODO Auto-generated method stub
			return null;
		}

		public static void mousehover(WebElement ele) {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
		}

		public static void Draganddrop(WebElement to, WebElement from) {
			try {
				Actions act = new Actions(driver);
				act.dragAndDrop(to, from).build().perform();
				act.clickAndHold(to).moveToElement(from).release(from).build().perform();
			} catch (Exception e) {
				System.out.println(" issue in draganddrop  " + e);
			}
		}

		public static void resize(WebElement ele) {
			Actions act = new Actions(driver);
			act.clickAndHold().dragAndDropBy(ele, 450, 450).perform();
		}

	}


