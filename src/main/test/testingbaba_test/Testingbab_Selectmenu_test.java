package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Selectmenu_page;
public class Testingbab_Selectmenu_test extends Baseliberary {
Testingbaba_Selectmenu_page  ob;
	@BeforeTest
	 public void getlaunch()
	 {
		getlaunch("https://testingbaba.com");
		clickonclosebtn();
		ob=new Testingbaba_Selectmenu_page();
	 }
	@Test(priority = 0)
	public void clickonwedgets()
	{
		ob.clickonwedgets();
	}
	@Test(priority = 1)
	public void selectvalue() 
	{
		ob.selectvalue();
	}
	@Test(priority = 2)
	public void getdatafromdropdown()
	{
		ob.getdatafromdropdown();
	}
	@Test(priority = 3)
	public void clickonmultislet()
	{
		ob.clickonmultislet();
	}
	@Test(priority = 4)
	public void selectmultiple()
	{
		ob.selectmultiple();
	}
	@Test(priority = 5)
	public void getdata()
	{
		ob.getdata();
	}

}
