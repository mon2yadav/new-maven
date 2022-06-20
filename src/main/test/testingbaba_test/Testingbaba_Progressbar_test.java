package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Progressbar_page;
public class Testingbaba_Progressbar_test extends Baseliberary {
Testingbaba_Progressbar_page ob;
	@BeforeTest
	public void getlounchurl() {
		getlaunch("https://testingbaba.com/");
		clickonclosebtn();
		ob=new Testingbaba_Progressbar_page();
	}
	@Test(priority = 0)
	public void clickonwidget() {
		ob.clickonwidget();
	}
	@Test(priority = 1)
	public void clickonprogressbar() {
		ob.clickonprogressbar();
	}
	@Test(priority = 2)
	public void clickonstart() throws InterruptedException {
		ob.clickonstart();
	}
}
