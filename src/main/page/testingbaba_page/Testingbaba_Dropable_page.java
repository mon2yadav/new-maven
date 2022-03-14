package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_all;
import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Dropable_page extends Baseliberary {
public Testingbaba_Dropable_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='Elements']")
	private WebElement element;	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div")
	private WebElement intraction;
	
	@FindBy(xpath = "//*[text()='Droppable']")
	private WebElement dropable;
	
	@FindBy(xpath = "//*[text()='Drag me']")
	private WebElement dragitem;
	
	@FindBy(xpath = "//*[@id=\"droppable\"]")
	private WebElement dropitem;

    public void clickonelement()  {
    	Application_utility_all.scrollByXPath(element);
    	Application_utility_my.clickme(element);
    }
    public void clickonintraction() {
    	Application_utility_all.scrollByXPath(intraction);
    	Application_utility_my.clickme(intraction);
    }
    public void clickondropable() {
    	Application_utility_my.clickme(dropable);
    }
    public void draganddrop() {
    	Application_utility_my.Draganddrop(dragitem, dropitem);	
    }
    }
