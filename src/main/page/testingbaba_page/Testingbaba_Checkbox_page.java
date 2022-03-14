package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliberary.Baseliberary;
public class Testingbaba_Checkbox_page extends Baseliberary {
	public Testingbaba_Checkbox_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement element;
	@FindBy(xpath = "//*[text()='check box']")
	private WebElement checkbox;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/iframe")
	private WebElement iframe;

	@FindBy(xpath = "//*[@id=\"myCheck\"]")
	private WebElement mobilecheckbox;

	@FindBy(xpath = "//*[@id=\"mylaptop\"]")
	private WebElement laptopbox;

	@FindBy(xpath = "//*[@id=\"mydesktop\"]")
	private WebElement desktop;

	public void clickonelement()
	{
		element.click();
		
	}

	public void clickoncheckbox() 
	{
		
		checkbox.click();
	}
	public void selectcheckbox()
	{
		driver.switchTo().frame(iframe);
		mobilecheckbox.click();
		laptopbox.click();
		desktop.click();
		driver.switchTo().defaultContent();
	}
	}


