package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Dynamicprop_page;
public class Testingbaba_Dynamicprop_test extends Baseliberary {
Testingbaba_Dynamicprop_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch("https://testingbaba.com/");
		clickonclosebtn();
		ob=new Testingbaba_Dynamicprop_page();
	}
	@Test(priority = 0)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 1)
	public void clickondynamicprop()
	{
		ob.clickondynamicprop();
	}
	@Test(priority = 2)
	public void enabledin5secon() throws Exception
	{
		ob.enabledin5secon();
	}

}
