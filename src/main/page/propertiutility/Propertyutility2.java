package propertiutility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyutility2 {
	public static String path="C:\\Users\\hp\\eclipse-workspace\\30dec_Automationfor_matic\\testdata\\config.data1";
		public static String getReaddata(String key) throws Exception
		{
			String value="";
			try 
			{
				FileInputStream fis = new  FileInputStream(path);
				Properties prop=new Properties();
				prop.load(fis);
				value=prop.getProperty(key).trim();
			} 
			catch (FileNotFoundException e) 
			{
				
				System.out.println("Issue in getdata "+e);
			}
			
			return value;
			
		}


	}


