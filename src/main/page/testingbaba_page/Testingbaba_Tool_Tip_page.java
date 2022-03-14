package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Tool_Tip_page extends Baseliberary {


	public Testingbaba_Tool_Tip_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@data-target=\"#widget\"]")
	private WebElement widget;
	
	@FindBy(xpath = "//*[text()='tool tips']")
	private WebElement tooltip;
	
	@FindBy(xpath = "//*[@id=\"tab_22\"]/button")
	private WebElement hovermetosee;
	
	public void clickonwidget() {
		Application_utility_my.clickme(widget);
	}
	public void clickontooltip() {
		Application_utility_my.clickme(tooltip);
	}
   public void clickonhoverme() {
	   Application_utility_my.mousehover(hovermetosee);
	   String tooltipdata=hovermetosee.getAttribute("title");
	   System.out.println(tooltipdata);
   }
}
