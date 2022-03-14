package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Webtable_page;
public class Testingbaba_Webtable_test extends Baseliberary {


	Testingbaba_Webtable_page ob2;
	@BeforeTest
	public void getlaunchurl() 
	{
	getlaunch("https://testingbaba.com/");
	clickonclosebtn();
    ob2=new Testingbaba_Webtable_page();
	}
	@Test(priority = 0, enabled = true)
	public void clickonelement()
	{
	ob2.clickonelement();
	}
	@Test(priority = 1, enabled = true)
	public void clickonwebtable()
	{
		ob2.clickonwebtable();
	}@Test(priority = 2, enabled =  true)
	public void filldatawebtable()
	{
		ob2.filldatawebtable();
	}
	@Test(priority = 3, enabled = true)
	public void getreaddata() 
	{
		
		ob2.getreaddata();
	}
	@Test(priority = 4, enabled = true)
	public void clickoneditbtn()
	{
		ob2.clickoneditbtn();
	}
	@Test(priority = 5, enabled = true)
	public void getclearnamefield()
	{
		ob2.getclearnamefield();
	}
	@Test(priority = 6, enabled = true)
	public void fillnewdata()
	{
		ob2.fillnewdata();
	}
	@Test(priority = 7, enabled = true)
	public void clickondeletbtn()
	{
		ob2.clickondeletbtn();
	}
     
    
}
