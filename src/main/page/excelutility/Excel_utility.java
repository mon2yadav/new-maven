package excelutility;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import baseliberary.Baseliberary;

public class Excel_utility extends Baseliberary {
	static String path ="C:\\Users\\hp\\eclipse-workspace\\30dec_Automationfor_matic\\testdata\\Test data.xlsx";
		public static String   getreaddata(int rownum, int colnum)
		{
			String value="";
			try 
			{
				
				FileInputStream fis=new FileInputStream(path);
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				 XSSFSheet sheet=wb.getSheetAt(0);
				 value=sheet.getRow(rownum).getCell(colnum).getStringCellValue().trim();
				
				
			} catch (Exception e) 
			{
				System.out.println("issue in getreaddata "+e);
			}
			return value;
			
		}
		public static int rowcount()
		{
			int rownum=0;
			try 
			{
				FileInputStream fis=new FileInputStream(path);
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				 XSSFSheet sheet=wb.getSheetAt(0);
				 rownum=sheet.getLastRowNum()+1;
				
			} catch (Exception e) 
			{
				System.out.println("Issue in getreaddata  "+e);
			}
			return rownum;
			
		}

	}


