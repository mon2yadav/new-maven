package screenshot;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import baseliberary.Baseliberary;

public class Screenshot extends Baseliberary {
	public void takescreenshot() 
		{
			try
			{
				
				TakesScreenshot ts=(TakesScreenshot)driver; // type casting
				  File src=ts.getScreenshotAs(OutputType.FILE);
				  String screenshotName = null;
				File dest=new File("./screenshot/"+screenshotName+".PNG");
				  Files.copy(src, dest);
				
			} 
			catch (Exception e) 
			{
				System.out.println("issue in takescreenshot    "+e);
			}
		
		}

//	public static void getscreenshot(String string, String methodname) {
//		// TODO Auto-generated method stub
//	}
}


	


