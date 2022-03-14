package testingbaba_page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_all;
import applicationutility.Application_utility_my;

import org.openqa.selenium.WebElement;
import baseliberary.Baseliberary;
public class Testingbaba_Resize_page extends Baseliberary {
	public Testingbaba_Resize_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Elements']")
	private WebElement element;	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div")
	private WebElement intraction;
	
	@FindBy(xpath = "//*[text()='Resizable']")
	private WebElement resizable;
	
	@FindBy(xpath = "//*[@class=\"box react-resizable\"]")
	private WebElement resizepoint;
	
	   public void clickonelement()  {
		   Application_utility_all.scrollByXPath(element);
	    	Application_utility_my.clickme(element);
	    }
	    public void clickonintraction() {
	    	Application_utility_all.scrollByXPath(intraction);
	    	Application_utility_my.clickme(intraction);
	    }
	    public void cliconresizable() {
	    	Application_utility_my.clickme(resizable);
	    }
	    public void clickonresizepoint() {
	    	Application_utility_all.scrollByXPath(resizepoint);
	    	Application_utility_my.resize(resizepoint);
	    }

}
