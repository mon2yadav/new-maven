package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_all;
import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Link_page extends Baseliberary {
public Testingbaba_Link_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement element;
	
	@FindBy(xpath = "//*[text()='links']")
	private WebElement links;
	
	@FindBy(xpath = "//*[text()='Demo Page']")
	private WebElement demopage;
	
	
	
	public void clickonelement()
	{
	Application_utility_my.clickme(element);
	}
	
	public void clickonlinks() 
	{
		Application_utility_my.clickme(links);
	}
    public void clickondemopagelink() throws Exception 
    {
    	demopage.click();
        Thread.sleep(2000);
    	Application_utility_all.ChangeWindow(1);
    	clickonclosebtn();
    	driver.close();
    	Application_utility_all.ChangeWindow(0);
    
   }


}
