package testingbaba_page;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Selectmenu_page extends Baseliberary {
public Testingbaba_Selectmenu_page() 
{
	PageFactory.initElements(driver, this);
	
}


@FindBy(xpath = "//*[@data-target=\"#widget\"]")
private WebElement wedgets;

@FindBy(xpath = "//*[text()='select menu']	")
private WebElement selectmenu;

@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[1]/select")
private WebElement selectvalue;

@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[5]/div/select")
private WebElement multiselect;

public void clickonwedgets()
{
	Application_utility_my.clickme(wedgets);
	Application_utility_my.clickme(selectmenu);
}
public void selectvalue()
{
	Application_utility_my.dropdownbyvalue(selectvalue, "Group 1, Option 2");
}
public  void getdatafromdropdown()
{
	Select sel=new Select(selectvalue);
	List<WebElement> list=sel.getOptions();
	System.out.println(list.get(1).getText());
	System.out.println(list.get(2).getText());
	System.out.println(list.get(3).getText());
	System.out.println(list.get(4).getText());
}
public void clickonmultislet()
{
	Select sel=new Select(multiselect);
	   List<WebElement>  list2=sel.getOptions();
	   list2.get(0).click();
	   list2.get(1).click();
	   list2.get(2).click();
	   list2.get(3).click();
}

public void selectmultiple()
{
	Application_utility_my.dropdownbyvalue(multiselect, "HTML");
	Application_utility_my.dropdownbyvalue(multiselect, "CSS");
	Application_utility_my.dropdownbyvalue(multiselect, "PHP");
	Application_utility_my.dropdownbyvalue(multiselect, "javascript");
}
public void getdata()
{
	
		
		Select sel = new Select(multiselect);
		List<WebElement> list1 =sel.getOptions();
		System.out.println(list1.get(0).getText());
		System.out.println(list1.get(1).getText());
		System.out.println(list1.get(2).getText());
		System.out.println(list1.get(3).getText());
}
		
}
