package testingbaba_page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_all;
import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;

public class Github_page extends Baseliberary {
	public Github_page() {
		PageFactory.initElements(driver, this);
	}
       @FindBy(xpath = "//*[@class=\"HeaderMenu-link flex-shrink-0 no-underline\"]")
		private WebElement signin;
		
		@FindBy(xpath = "//input[@id=\"login_field\"]")
	    private WebElement emailid;
		
		@FindBy(xpath = "//input[@id=\"password\"]")
		private WebElement password;
		
		@FindBy(xpath = "//*[@type=\"submit\"]")
		private WebElement clickonsignin;
		
		@FindBy(xpath = "//*[@href=\"/mon2yadav/montu-123\"]")
		private WebElement selectreposatory;
		
//		@FindBy(xpath = "//a[@class=\"btn btn-sm btn-primary\"]")
//		private WebElement newtab;
	//	
//		@FindBy(xpath = "//input[@id=\"repository_name\"]")
//		private WebElement reposatoryname;
	//	
//		@FindBy(xpath = "//input[@value=\"private\"]")
//		private WebElement selectprivate;
	//	
//		@FindBy(xpath = "//*[@id=\"new_repository\"]/div[4]/button")
//		private WebElement creatreposatory;
		
		@FindBy(xpath = "//input[@placeholder=\"Search or jump to…\"]")
		private WebElement searchfiled;
		
		@FindBy(xpath = "//*[@class=\"avatar avatar-small circle\"]")
		private WebElement signout;
		
		@FindBy(xpath = "/html/body/div[1]/header/div[7]/details/details-menu/form/button")
		private WebElement cliconsignoutt;
		
		public void clickonsignin() {
			Application_utility_my.clickme(signin);
		}
		public void fillemailid() {
			Application_utility_my.clickme(emailid);
			emailid.sendKeys("mon2yadav");
		}
		public void fillpassword() {
			Application_utility_my.clickme(password);
			password.sendKeys("cyient@my0092");
		}
		public void clicksignin() {
			Application_utility_my.clickme(clickonsignin);
		}
//		public void clicknewbtn() {
//			Application_utility_my.clickme(newtab);
//		}
//		public void addnewreposatory() {
//			Application_utility_my.clickme(reposatoryname);
//			reposatoryname.sendKeys("montu@123");
//		}
//		public void selectprivate() {
//			Application_utility_my.clickme(selectprivate);
//		}
//		public void createrepos() {
//			Application_utility_all.scrollByXPath(creatreposatory);
//			Application_utility_my.clickme(creatreposatory);
//		}
		public void clickonsearchfield() {
			Application_utility_my.clickme(searchfiled);
			searchfiled.sendKeys("montu_123");
			searchfiled.sendKeys(Keys.ENTER);
		}
		public void selectnewrepsatory() {
			Application_utility_my.clickme(selectreposatory);
		}
		public void cliconsignout() {
			Application_utility_my.clickme(signout);
			Application_utility_all.scrollByXPath(cliconsignoutt);
			Application_utility_my.clickme(cliconsignoutt);
		}

	}


