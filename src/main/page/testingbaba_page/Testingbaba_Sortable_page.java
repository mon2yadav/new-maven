package testingbaba_page;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Sortable_page extends Baseliberary {
     public Testingbaba_Sortable_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@data-target=\"#interations\"]")
	private WebElement intraction;
	
	@FindBy(xpath = "//*[text()='sortable']")
	private WebElement sortable;
	
	@FindBy(xpath = "//*[text()='Sort']")
	private WebElement sort;
	
	public void clickonintract() {
	Application_utility_my.clickme(intraction);
	}
	public void clickonsortable() {
		Application_utility_my.clickme(sortable);
	}
	public void gettabledata() {
		int count=1;
		List<WebElement> li=null;
		ArrayList<String>li1=new ArrayList<String>();
		
		System.out.println();
		
			
				li=driver.findElements(By.xpath("//*[@id='myTable']/tbody/tr/td"));
				
				for(int j=0;j<=7;j++)
				{
					li1.add(li.get(j).getText());
				}
			ArrayList<String>	li2=new ArrayList<String>();
			Application_utility_my.clickme(sortable);
		    Collections.sort(li1);
		   li= driver.findElements(By.xpath("//*[@id='myTable']/tbody/tr/td[\"+j+\"]"));
		   for(int j=0; j<=7; j++)
		   {
			   li2.add(li.get(j).getText()); 
		   }
		
	
		}	
	}
	



