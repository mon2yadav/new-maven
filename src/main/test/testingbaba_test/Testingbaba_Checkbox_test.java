package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Checkbox_page;

public class Testingbaba_Checkbox_test extends Baseliberary {
	Testingbaba_Checkbox_page ob;
			@BeforeTest
			public void getlaunchbuild()
			{
				getlaunch("https://testingbaba.com/");
			clickonclosebtn();
				ob=new Testingbaba_Checkbox_page();
			
		    }
			@Test(priority = 0)
			public void clickonelement()
			{
				ob.clickonelement();
			}
			@Test(priority = 1)
			public void clickoncheckbox() 
			{
				ob.clickoncheckbox();
			}
			@Test(priority = 2)
			public void selectcheckbox()
			{
				ob.selectcheckbox();
			}
		}



