package testingbaba_page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
import propertiutility.Propertyutility;

public class Testingbaba_button_page extends Baseliberary {
	public Testingbaba_button_page()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
		private WebElement element;
		
		@FindBy(xpath = "//*[text()='buttons']")
		private WebElement button;
		
		@FindBy(xpath = "//*[@ondblclick=\"doubletext()\"]")
		private WebElement doubleclick;
		
		@FindBy(xpath = "//*[@oncontextmenu=\"righttext()\"]")
		private WebElement rightclick;
		
		@FindBy(xpath = "//*[@onclick=\"clicktext()\"]")
		private WebElement click;
		
		@FindBy(xpath = "//*[@class=\"btn-content\"]/p")
		private List<WebElement> foundata;
		
		public void clickonelement()
		{
			Application_utility_my.clickme(element);
		}
		
		public void clickonbutton()
		{
			Application_utility_my.clickme(button);
		}
		
		public void doubleclick()
		{
			Application_utility_my.doubleclick(doubleclick);
		}
		public void rightclick()
		{
			Application_utility_my.rightClick(rightclick);
			Application_utility_my.clickme(click);
//			rightclick.isEnabled();
		}
		
		public void getverifydata() throws Exception
		{
			ArrayList<String> actual=new ArrayList<String>();
			ArrayList<String> expected=new ArrayList<String>();
			actual.add(foundata.get(0).getText());
			actual.add(foundata.get(1).getText());
			actual.add(foundata.get(2).getText());
			expected.add(Propertyutility.getReaddata("doubleclick"));
			expected.add(Propertyutility.getReaddata("rightclick"));
			expected.add(Propertyutility.getReaddata("click"));
			SoftAssert asert=new SoftAssert();
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


