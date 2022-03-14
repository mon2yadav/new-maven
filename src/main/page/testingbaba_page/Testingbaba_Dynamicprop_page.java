package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Dynamicprop_page extends Baseliberary {
 public Testingbaba_Dynamicprop_page() 
   {
	PageFactory.initElements(driver, this);
   }
   @FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement element;
   
   @FindBy(xpath = "//*[@onclick=\"changeText(this),dynamicproperties();\"]")
   private WebElement dynamicprop;
   
   @FindBy(xpath = "//*[@id=\"Enable\"]")
   private WebElement enabled;
   
   public void clickonelement()
	{
		Application_utility_my.clickme(element);
	}
   public void clickondynamicprop()
   {
	   Application_utility_my.clickme(dynamicprop);
   }
   
   public void enabledin5secon() throws Exception
   {
	   boolean data=enabled.isEnabled();
	   System.out.println(data);
	   Thread.sleep(5000);
	   boolean data1=enabled.isEnabled();
	   System.out.println(data1);
   }
   
}
