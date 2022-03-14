package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;

public class ClockIN_page extends  Baseliberary {
	
public ClockIN_page() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@name=\"email\"]")
		private WebElement enteremailID;
		
		@FindBy(xpath = "//*[@id=\"password\"]")
		private WebElement enterpasword;
		
		@FindBy(xpath = "//*[@type=\"submit\"]")
		private WebElement signup;
		
		@FindBy(xpath = "//*[@title=\"Clock Out\"]")
		private WebElement clickin;
		
		@FindBy(xpath = "//*[@title=\"Clock In\"]")
		private WebElement clockout;
		
		public void emailId() {
//			Applicationutility.clickme(enteremailID);
			enteremailID.sendKeys("montu.yadav@medgrids.in");
		}
		
		public void enterpassword() {
//			Applicationutility.clickme(enterpasword);
			enterpasword.sendKeys("pinki@123");
		}
		public void clickonsignup() {
			Application_utility_my.clickme(signup);
		}
		
		public void clickin() {
			Application_utility_my.clickme(clickin);
			
		}
		public void clickout() throws Exception  {
			Thread.sleep(10000);
			Application_utility_my.clickme(clockout);	
		}
		

	}


