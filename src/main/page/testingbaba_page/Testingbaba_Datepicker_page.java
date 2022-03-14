package testingbaba_page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility_all;
import applicationutility.Application_utility_my;
import baseliberary.Baseliberary;
public class Testingbaba_Datepicker_page extends Baseliberary {
	public Testingbaba_Datepicker_page() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//*[@data-target=\"#widget\"]")
		private WebElement widget;

		@FindBy(xpath = "//*[text()='date picker']")
		private WebElement datepicker;

		@FindBy(xpath = "//*[@id=\"datePickerContainer\"]/div[1]/div[2]/input")
		private WebElement selectdate;
		@FindBy(xpath = "//*[text()='Date And Time']/following::input[@type=\"datetime-local\"]")
		private WebElement selectdatetime;

		public void clickonwidget() {
			Application_utility_my.clickme(widget);
		}

		public void clickondatepicker() {
			Application_utility_my.clickme(datepicker);
		}

		public void selectdate() {
			Application_utility_my.clickme(selectdate);
			selectdate.sendKeys(Keys.ARROW_LEFT);
			selectdate.sendKeys(Keys.ARROW_LEFT);
			String currentdate = Application_utility_all.Getcurrentdate();
			}
		public void selectdatetime() {
			Application_utility_my.clickme(selectdatetime);
			selectdate.sendKeys(Keys.ARROW_LEFT);
			selectdate.sendKeys(Keys.ARROW_LEFT);
			selectdate.sendKeys(Keys.ARROW_LEFT);
			selectdate.sendKeys(Keys.ARROW_LEFT);
			selectdate.sendKeys(Keys.ARROW_LEFT);
			String datetime=Application_utility_all.GetdateTime();
			selectdate.sendKeys(datetime);
		}
		

	}


