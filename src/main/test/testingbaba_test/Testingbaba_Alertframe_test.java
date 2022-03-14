package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Alertframe_page;

public class Testingbaba_Alertframe_test extends Baseliberary {
	Testingbaba_Alertframe_page ob;
		@BeforeTest
		public void getlaunchurl()
		{
			getlaunch("https://testingbaba.com/");
			clickonclosebtn();
			ob=new Testingbaba_Alertframe_page();
		}
		
		@Test(priority = 0)
		public void clickonalert_frame() throws Exception
		{
			ob.clickonalert_frame();
		}
		@Test(priority = 1)
		public void clickonalert()
		{
			ob.clickonalert();
		}
		@Test(priority = 2)
		public void clickme()
		{
			ob.clickme();
		}
		@Test(priority = 3)
		public void waitclick() throws Exception
		{
			ob.waitclick();
		}
		@Test(priority = 4)
		public void alertcancle()
		{
			ob.alertcancle();
		}
		@Test(priority = 5)
		public void senddatainalert() throws Exception
		{
			ob.senddatainalert();
		}
	}


