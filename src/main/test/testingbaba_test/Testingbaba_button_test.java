package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_button_page;

public class Testingbaba_button_test extends Baseliberary {
Testingbaba_button_page ob;
		@BeforeTest 
		public void getlaunchurl()
		{
			getlaunch("https://testingbaba.com/");
			clickonclosebtn();
			ob=new Testingbaba_button_page();
		}
		@Test(priority = 0)
		public void clickonelement()
		{
			ob.clickonelement();
		}
		@Test(priority = 1)
		public void clickonbutton()
		{
			ob.clickonbutton();
		}
		@Test(priority = 2)
		public void doubleclick()
		{
			ob.doubleclick();
		}
		@Test(priority = 3)
		public void rightclick()
		{
			ob.rightclick();
		}
		@Test(priority = 4)
		public void getverifydata() throws Exception
		{
			ob.getverifydata();
		}
	}


