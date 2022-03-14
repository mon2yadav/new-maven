package testingbaba_page;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baseliberary.Baseliberary;
import excelutility.Excel_utility;
public class Testingbaba_Webtable_page extends Baseliberary {


	public Testingbaba_Webtable_page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement element;
	
	@FindBy(xpath = "//*[text()='web tables']")
	private WebElement webtables;
	
	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	private WebElement iframe;
	
	@FindBy(xpath = "//*[text()='Name:']/following::input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath = "//*[text()='Email:']/following::input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath = "//*[@name=\\\"edit_name\\")
	private WebElement name1;
	
	@FindBy(xpath = "//*[@name=\\\"edit_email\\")
	private WebElement email1;
	
	@FindBy(xpath = "//*[text()='Update']")
	private WebElement update;
	
	public void clickonelement()
	{
	element.click();
	}
	
	public void clickonwebtable()
	{
		webtables.click();
	}
	public void filldatawebtable() 
	{
		driver.switchTo().frame(iframe);
		for(int i=1 ; i<=Excel_utility.rowcount()-1;i++)
		{
			name.sendKeys(Excel_utility.getreaddata(i, 0));
			email.sendKeys(Excel_utility.getreaddata(i, 1));
			save.click();
		}
	}
	public void getreaddata()
	{
		 List<WebElement> list1=null;
		 
		 ArrayList<String> actualData=new ArrayList<String>();
		for(int i=1; i<=2; i++)
		{
			 list1 = driver.findElements(By.xpath("//*[@class=\"table table-bordered data-table\"]/tbody/tr/td["+i+"]"));
		
			 for(WebElement ele:list1)
			 {
				actualData.add(ele.getText());	 
			 }
		}    
		
		for(int j=0; j<=1; j++)
		{
			 int  count=Excel_utility.rowcount();
			 for(int i=1; i<=count-1; i++)
			 {
				  String data=Excel_utility.getreaddata(i, j);
				  for(String dd1:actualData)
				  {
					  
					  Assert.assertEquals(dd1,data);
					  actualData.remove(0);
					  break;
				  }
			 }
		}
	}
	public void clickoneditbtn()
	{
		try
		{
			
			List<WebElement> editbtn=driver.findElements(By.xpath("//*[text()='Edit']"));
			for(WebElement dd:editbtn)
			{
				dd.click();
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(" issue in edit button  "+e);
		}
	}
	public void getclearnamefield()
	{
		try 
		{
			
			 List<WebElement> name=driver.findElements(By.xpath("//*[@name=\"edit_name\"]"));
			List<WebElement> email= driver.findElements(By.xpath("//*[@name=\"edit_email\"]"));
			 for(int i=0; i<=name.size()-1; i++)
			 {
				 name.get(i).clear();
				 email.get(i).clear();
			 }
			
			 
		}
		catch (Exception e)
		{
			System.out.println("issue in clearnamefield  "+e);
		}
	}
	public void fillnewdata()
	{
		try
		{
			 List<WebElement> name1=driver.findElements(By.xpath("//*[@name=\"edit_name\"]"));
				List<WebElement> email1= driver.findElements(By.xpath("//*[@name=\"edit_email\"]"));
			 
			 for(int j=0; j<=Excel_utility.rowcount()-1;j++)
			 {
				 name1.get(j).sendKeys(Excel_utility.getreaddata(j+1, 2));
				 email1.get(j).sendKeys(Excel_utility.getreaddata(j+1, 3));
				 update.click();
			 }
			
		}
		catch (Exception e)
		{
		System.out.println(" issue in getfillnewdata  " +e);
		}
		
		
			
	}
	public void clickondeletbtn()
	{
		try
		{
		           List<WebElement> deletbtn=driver.findElements(By.xpath("//*[text()='Delete']"));
		           for( WebElement dd:deletbtn)
		           {
		        	   dd.click();
		           }
			
		}
		catch (Exception e)
		{
			System.out.println("issu in click the deletbtn   "+e);
		}
	}
			
		

}

				  
			 
		
			 
			
		
	
	



