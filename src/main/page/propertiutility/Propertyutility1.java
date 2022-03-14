package propertiutility;
import java.io.FileInputStream;
import java.nio.channels.FileLockInterruptionException;
import java.util.Properties;

public class Propertyutility1 {
public static String path="C:\\Users\\hp\\eclipse-workspace\\30dec_Automationfor_matic\\testdata\\config.data";
		public static String getreaddata(String key) throws Exception
		{
			String value="";
			try 
			{
				FileInputStream fis=new FileInputStream(path);
				Properties prop=new Properties();
				prop.load(fis);
				value=prop.getProperty(key).trim();
			}
			catch (FileLockInterruptionException e) 
			{
				System.out.println(" issue in getdata   "+e);
			}
			return value;
		}

	}


