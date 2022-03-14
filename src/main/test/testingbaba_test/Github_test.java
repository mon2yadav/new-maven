package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import testingbaba_page.Github_page;

public class Github_test extends Baseliberary {
	Github_page ob;
		@BeforeTest
		public void getlounchurl() {
			getlaunch("https://github.com");
			ob=new Github_page();
		}
		@Test(priority = 0)
		public void clickonsignin() {
			ob.clickonsignin();
		}
		@Test(priority = 1)
		public void fillemailid() {
			ob.fillemailid();
		}
		@Test(priority = 2)
		public void fillpassword() {
			ob.fillpassword();
		}
		@Test(priority = 3)
		public void clicksignin() {
			ob.clicksignin();
		}
//		@Test(priority = 4)
//		public void clicknewbtn() {
//			ob.clicknewbtn();
//		}
//		@Test(priority = 5)
//		public void addnewreposatory() {
//			ob.addnewreposatory();
//		}
//		@Test(priority = 6)
//		public void selectprivate() {
//			ob.selectprivate();
//		}
//		@Test(priority = 7)
//		public void createrepos() {
//			ob.createrepos();
//		}
		@Test(priority = 4)
		public void clickonsearchfield() {
			ob.clickonsearchfield();
		}
		@Test(priority = 5)
		public void selectnewrepsatory() {
			ob.selectnewrepsatory();
		}
		@Test(priority = 6)
		public void cliconsignout() {
			ob.cliconsignout();
		}

	}


