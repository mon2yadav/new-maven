package testingbaba_test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Uploadfile_page;
public class Testingbaba_Uploadfile_test extends Baseliberary {


	Testingbaba_Uploadfile_page ob;
	@BeforeSuite
	public void getlaunch()
	{
		getlaunch("https://testingbaba.com");
		clickonclosebtn();
		ob=new Testingbaba_Uploadfile_page();
	}
	@Test(priority = 0)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 1)
	public void clickonuploadanddownload()
	{
		ob.clickonupload();
	}
	@Test(priority = 2)
	public void selectfile()
	{
		ob.selectfile();
	}
	

}
