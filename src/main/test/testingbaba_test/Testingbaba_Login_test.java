package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Login_page;
public class Testingbaba_Login_test extends Baseliberary {
Testingbaba_Login_page ob;
	@BeforeTest
	public void getlaunchurl() 
	{
	getlaunch("https://testingbaba.com/");
	clickonclosebtn();
	ob=new Testingbaba_Login_page();
	}
	@Test(priority = 0)
	public void getverifytitle_testingbaba() 
	{
		ob.getverifytitle_testingbaba();
		
	}
	
}
