package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Textbox_page;
public class Testingbaba_Textbox_test  extends Baseliberary {


	Testingbaba_Textbox_page ob1;
	@BeforeTest
	public void getlaunchurl() 
	{
	getlaunch("https://testingbaba.com/");
	clickonclosebtn();
	
	ob1=new Testingbaba_Textbox_page();
	}
	@Test(priority = 0)
	public void clickonelement()
	{
	ob1.clickonelement();
	}
	@Test(priority = 1)
	public void clickontextbox()
	{
		ob1.clickontextbox();
	}

	@Test(priority = 2,enabled = true)
	public void fillvalues() throws Exception
	{
		ob1.fillvalues();
		
	}
	@Test(priority = 3,enabled = true)
	public void getverifytextboxdata() throws Exception
	{
		ob1.getverifytextboxdata();
	}
	
	


}
