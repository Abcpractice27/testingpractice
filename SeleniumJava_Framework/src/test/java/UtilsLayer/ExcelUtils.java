//FileinputStream -> XSSFWorkbook -> XSSFSheet -> XSSFRow -> XSSFCell
package UtilsLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static void main(String[] args) throws IOException {
		try {
			
			FileInputStream fs = new FileInputStream("C://Users//Admin//eclipse//project1//SeleniumJava_Framework//excel//employessdata.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheet("Sheet1");  //providing sheet name
			
			//reading the data from excel first we need to count how many row and col are there thn use for loop
			int rowcount = sheet.getLastRowNum();  //give the row count
			
			int colcount = sheet.getRow(0).getLastCellNum(); //no of cells/cols present in a single row
			
			for(int i=0; i<rowcount; i++) //increasing/reading the row count
			{
				XSSFRow currentrow = sheet.getRow(i); //focus on current row 
				
				for(int j=0; j<colcount; j++) //increment the cell for particular row
				{
					String value = currentrow.getCell(j).toString();  //READ THE VALUE FROM CELL
					System.out.print(" " +value);
				}
				System.out.println();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//	public static void getRowCount() {
//	try{
//		
//		String projectpath = System.getProperty("user.dir");
//		XSSFWorkbook workbook = new XSSFWorkbook(projectpath+"/excel/employessdata.xlsx");
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		int rowcount = sheet.getPhysicalNumberOfRows();
//		System.out.println("No of rows:" + rowcount);
//	}
//	catch(Exception e) {
//		
//	}
//	}
}
