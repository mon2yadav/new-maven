package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Sortable_page;
public class Testingbaba_Sortable_test extends Baseliberary {
   Testingbaba_Sortable_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch("https://testingbaba.com");
		clickonclosebtn();
		ob=new Testingbaba_Sortable_page();
	}
	@Test(priority = 0)
	public void clickonintract() {
		ob.clickonintract();
	}
	@Test(priority = 1)
	public void clickonsortable() {
		ob.clickonsortable();
	}

	@Test(priority = 2)
	public void gettabledata() {
		ob.gettabledata();
	}

}
