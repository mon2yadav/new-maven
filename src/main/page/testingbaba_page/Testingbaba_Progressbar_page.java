package testingbaba_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Progressbar_page extends Baseliberary {
public Testingbaba_Progressbar_page() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//button[@data-target=\"#widget\"]")
private WebElement widget;

@FindBy(xpath = "//*[text()='progress bar']")
private WebElement progressbar;

@FindBy(xpath = "//*[@id=\"resetButton\"]")
private WebElement startbutton;

@FindBy(xpath = "//*[@id=\"myBar\"]")
private WebElement progressslider;

public void clickonwidget() {
	Application_utility_my.clickme(widget);
}
public void clickonprogressbar() {
	Application_utility_my.clickme(progressbar);
}
public void clickonstart() throws InterruptedException {
	System.out.println("verify progress bar");
	String progressbarstatus=progressslider.getAttribute("style");   // because style=width
	System.out.println(progressbarstatus);
	Application_utility_my.clickme(startbutton);
	Thread.sleep(2000);
	String progressbarstatus1=progressslider.getAttribute("style");
	System.out.println(progressbarstatus1);
}
}
