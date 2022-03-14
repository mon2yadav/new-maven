package testingbaba_page;
import org.openqa.selenium.support.PageFactory;

import baseliberary.Baseliberary;
public class Testingbaba_Login_page extends Baseliberary {

public Testingbaba_Login_page () {
	PageFactory.initElements(driver, this);
}
public void getverifytitle_testingbaba() 
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	

	
}
