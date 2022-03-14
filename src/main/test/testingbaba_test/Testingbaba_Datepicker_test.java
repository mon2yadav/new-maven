package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Datepicker_page;
public class Testingbaba_Datepicker_test extends Baseliberary {
	Testingbaba_Datepicker_page ob;

		@BeforeTest
		public void getlaunch() {
			getlaunch("https://testingbaba.com/");
			clickonclosebtn();
			ob = new Testingbaba_Datepicker_page();
		}

		@Test(priority = 0)
		public void clickonwidget() {
			ob.clickonwidget();
		}

		@Test(priority = 1)
		public void clickondatepicker() {
			ob.clickondatepicker();
		}

		@Test(priority = 2)
		public void selectdate() {
			ob.selectdate();
	    }
		@Test(priority = 3)
		public void selectdatetime(){
			ob.selectdatetime(); 
		}
		
	}


