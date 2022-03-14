package testingbaba_page;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Selectable_page extends Baseliberary {






	public Testingbaba_Selectable_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@data-target=\"#interations\"]")
	private WebElement intraction;
	
	@FindBy(xpath = "//*[text()='selectable']")
	private WebElement selectable;
	
	@FindBy(xpath = "//*[@class=\"list-group\"]/li")
	List<WebElement> selectlist;
	
	@FindBy(xpath = "//*[text()='Select Grid']")
	private WebElement selectgrid;
	
	@FindBy(xpath = "//*[@id=\"grid-select\"]//*[@class=\"col-4\"]")
	List<WebElement> gridselect;
	
	public void clickonintraction() {
		Application_utility_my.clickme(intraction);
	}
	public void clickonselectable() {
		Application_utility_my.clickme(selectable);
	}
	public void selectdata()  {
		
		Application_utility_my.doubleclick(selectlist.get(0));
		Application_utility_my.doubleclick(selectlist.get(1));
		Application_utility_my.doubleclick(selectlist.get(2));
		Application_utility_my.doubleclick(selectlist.get(3));
		Application_utility_my.doubleclick(selectlist.get(4));
//		selectlist.get(0).click();
//		selectlist.get(2).click();
//		selectlist.get(4).click();
		
}
	public void clickonselectgrid() {
		Application_utility_my.clickme(selectgrid);
		
	}
	public void gridselect() {
		Application_utility_my.doubleclick(gridselect.get(0));
		Application_utility_my.doubleclick(gridselect.get(2));
		Application_utility_my.doubleclick(gridselect.get(4));
		Application_utility_my.doubleclick(gridselect.get(6));
		Application_utility_my.doubleclick(gridselect.get(8));
	}

}
