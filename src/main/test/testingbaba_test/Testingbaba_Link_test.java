package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Link_page;
public class Testingbaba_Link_test extends Baseliberary {
Testingbaba_Link_page ob;
	@BeforeTest
	public void getlounch()
	{
		
		getlaunch("https://testingbaba.com");
		clickonclosebtn();
		ob=new Testingbaba_Link_page();
	}
	@Test(priority = 0)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 1)
	public void clickonlinks()
	{
		ob.clickonlinks();
	}
	@Test(priority = 2)
	public void clickondemopagelink() throws Exception 
	{
		ob.clickondemopagelink();
		
	}
	

}
