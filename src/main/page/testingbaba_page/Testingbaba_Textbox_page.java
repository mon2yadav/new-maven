package testingbaba_page;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baseliberary.Baseliberary;
import propertiutility.Propertyutility;
public class Testingbaba_Textbox_page extends Baseliberary {
public Testingbaba_Textbox_page()
{
	PageFactory.initElements(driver, this);
}


@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
private WebElement element;

@FindBy(xpath = "//*[text()='text box']")
private WebElement textbox;

@FindBy(xpath = "//*[@id=\"fullname1\"]")
private WebElement name;

@FindBy(xpath = "//*[@id=\"fullemail1\"]")
private WebElement email;

@FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
private WebElement caddress;

@FindBy(xpath = "//*[@id=\"paddresh1\"]")
private WebElement paddress;

@FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
private WebElement submit;

@FindBy(xpath = "//*[@class=\"col-md-6 mt-5\"]/label")
private List<WebElement> founddata;

public void clickonelement()
{
	element.click();
	
}
public void clickontextbox()
{
	textbox.click();
}
public void fillvalues() throws Exception
{
	name.sendKeys(Propertyutility.getReaddata("name"));
	email.sendKeys(Propertyutility.getReaddata("email"));
	caddress.sendKeys(Propertyutility.getReaddata("caddress"));
	paddress.sendKeys(Propertyutility.getReaddata("paddress"));
	submit.click();
	Thread.sleep(3000);
	
}
public void getverifytextboxdata() throws Exception 
{
	ArrayList<String> actual=new ArrayList<String>();
	
	ArrayList<String> expected=new  ArrayList<String>();
	
	actual.add(founddata.get(1).getText());
	actual.add(founddata.get(3).getText());
	actual.add(founddata.get(5).getText());
	actual.add(founddata.get(7).getText());
	expected.add(Propertyutility.getReaddata("name"));
	expected.add(Propertyutility.getReaddata("email"));
	expected.add(Propertyutility.getReaddata("caddress"));
	expected.add(Propertyutility.getReaddata("paddress"));
   SoftAssert asert = new SoftAssert();	
	for(String dd:actual)
	{
		for(String dd1:expected)
		{
			Assert.assertEquals(dd, dd1);
			expected.remove(dd1);
			break;
		}
		
	}
	asert.assertAll();

}



}
