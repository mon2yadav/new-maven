package extendreport;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;

import baseliberary.Baseliberary;

public class Extend_report_montu extends Baseliberary {
	static ExtentReports report;
	static ExtentTest test;
	@BeforeClass
	public static void  starttest(ExtentObserver[] extentdemo)
	{
		 report=new ExtentReports();
		 test=report.attachReporter(extentdemo);
	}
	@Test
	public void extentreportdemo()
	{
		
	}

}
