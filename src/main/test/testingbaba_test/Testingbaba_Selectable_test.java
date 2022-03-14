package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Selectable_page;
public class Testingbaba_Selectable_test extends Baseliberary {
Testingbaba_Selectable_page ob;
	@BeforeTest
	public void getlounchurl() {
		getlaunch("https://testingbaba.com");
		clickonclosebtn();
		ob=new Testingbaba_Selectable_page();
	}
	@Test(priority = 0)
	public void clickonintraction() {
		ob.clickonintraction();
	}
	@Test(priority = 1)
	public void clickonselectable() {
		ob.clickonselectable();
	}
	@Test(priority = 2)
	public void selectdata() {
		ob.selectdata();
	}
	@Test(priority = 3)
	public void clickonselectgrid() {
		ob.clickonselectgrid();
	}
	@Test(priority = 4)
	public void gridselect() {
		ob.gridselect();
	}

}
