package excelutility;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import baseliberary.Baseliberary;
public class Excel_utility1 extends Baseliberary {
	public static String path="C:\\Users\\hp\\eclipse-workspace\\30dec_Automationfor_matic\\testdata\\Test data 1.xlsx";
	   public static String getreaddata(int ronum, int colnum)
	   {
		   String value="";
		   try 
		   {
			   FileInputStream fis=new FileInputStream(path);
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   XSSFSheet sheet=wb.getSheetAt(0);
			   value=sheet.getRow(ronum).getCell(colnum).getStringCellValue().trim();
			
		  }
		  catch (Exception e)
		  {
			System.out.println(" issue in getreaddata  "+e);
		  }
		  return value;
		   
	      }
	   
	   public static int rowcont()
	   
	   {
		   int rownum=0;
		   try
		   {
			   FileInputStream fis=new FileInputStream(path);
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			    XSSFSheet sheet=wb.getSheetAt(0);
			    rownum=sheet.getLastRowNum();
			
		} 
		   catch (Exception e) 
		   {
			System.out.println(" issue in getrownum  "+e);
		}
		return rownum;
		   
	   }
	}

		

