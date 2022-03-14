package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
import screenshot.Screenshot;
public class Testingbaba_Uploadfile_page extends Baseliberary {


public Testingbaba_Uploadfile_page()
{
	PageFactory.initElements(driver, this);
}

   public static String filelocation="C:\\Users\\hp\\eclipse-workspace\\30dec_Automationfor_matic\\testdata\\New Microsoft Word Document.docx";
{
	
}
@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
private WebElement element;

 @FindBy(xpath = "//*[text()='upload and download']")
 private WebElement clickonuploadanddownload;
 
 @FindBy(xpath = "//*[text()='Select a file']")
 private WebElement selectfile;

   public void clickonelement()
  {
  Application_utility_my.clickme(element);
//   Screenshotutility.getscreenshot("passed", "clickonelements");
  }
   public void clickonupload()
  {
	   Application_utility_my.clickme(clickonuploadanddownload);
  }
   public void selectfile()
   {
	   Application_utility_my.clickme(selectfile);
	   
	   Application_utility_my.fileupload(filelocation);
	   
   }

}
