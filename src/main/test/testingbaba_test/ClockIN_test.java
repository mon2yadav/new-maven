package testingbaba_test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.ClockIN_page;

public class ClockIN_test extends Baseliberary{
	ClockIN_page ob;

		@BeforeTest
		public void getlounchurl() {
			getlaunch("http://employee.agiosupport.in/dashboard#");
			ob = new ClockIN_page();
		}

		@Test(priority = 0)
		public void emailId() {
			ob.emailId();
		}

		@Test(priority = 1)
		public void enterpassword() {
			ob.enterpassword();
		}

		@Test(priority = 2)
		public void clickonsignup() {
			ob.clickonsignup();
		}

		@Test(priority = 3)
		public void clickin() {
			ob.clickin();
		}

		@Test(priority = 4)
		public void clickout() throws Exception {
			Thread.sleep(10000);
			
			ob.clickout();
		}

	}


