package testingbaba_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
import propertiutility.Propertyutility;

public class Testingbaba_Alertframe_page extends Baseliberary {
	public Testingbaba_Alertframe_page() 
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[@class=\"btn  btn-block p-0 text-left mr-5 \"]")
	private WebElement alertsframe;

	@FindBy(xpath = "//*[text()='alerts']")
	private WebElement alert;

	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[1]/div[2]/button")
	private WebElement clickme;

	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[2]/div[2]/button")
	private WebElement waitclick;

	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[3]/div[2]/button")
	private WebElement nextclik;

	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[4]/div[2]/button")
	private WebElement promtalert;

	public void clickonalert_frame() throws Exception
	{
		Thread.sleep(1000);
		Application_utility_my.clickme(alertsframe);
		
	}
	public void clickonalert()
	{
		Application_utility_my.clickme(alert);
	}
	public void clickme()
	{
		Application_utility_my.clickme(clickme);
		driver.switchTo().alert().accept();
	}
	public void waitclick() throws Exception
	{
		Application_utility_my.clickme(waitclick);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		}
	public void alertcancle()
	{
		Application_utility_my.clickme(nextclik);
		driver.switchTo().alert().dismiss();
	}
	public void senddatainalert() throws Exception 
	{
		Application_utility_my.clickme(promtalert);
		
	    driver.switchTo().alert().sendKeys(Propertyutility.getReaddata("name"));
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	}
	}


