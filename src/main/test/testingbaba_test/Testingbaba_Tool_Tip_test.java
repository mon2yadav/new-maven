package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Tool_Tip_page;
public class Testingbaba_Tool_Tip_test extends Baseliberary {


	Testingbaba_Tool_Tip_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch("https://testingbaba.com");
		clickonclosebtn();
		 ob=new Testingbaba_Tool_Tip_page();
	}
	@Test(priority = 0)
	public void clickonwidget() {
		ob.clickonwidget();
	}
	@Test(priority = 1)
	public void clickontooltip() {
		ob.clickontooltip();
	}
	@Test(priority = 2)
	public void clickonhoverme() {	
		ob.clickonhoverme();
	}

}
