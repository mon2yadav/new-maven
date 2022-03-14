package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Testingbaba_Resize_page;
public class Testingbaba_Resize_test extends Baseliberary {
Testingbaba_Resize_page ob;
	@BeforeTest
	public void getlaunchurl() {
		getlaunch("https://demoqa.com");
		
		ob=new Testingbaba_Resize_page();
	}
	@Test(priority = 0)
	public void clickonelement() {
		ob.clickonelement();
	}
	@Test(priority = 1)
	public void clickonintraction() {
		ob.clickonintraction();;
	}
	@Test(priority = 2)
	public void cliconresizable() {
		ob.cliconresizable();
	}
	@Test(priority = 3)
	public void clickonresizepoint() {
		ob.clickonresizepoint();
	}

}
