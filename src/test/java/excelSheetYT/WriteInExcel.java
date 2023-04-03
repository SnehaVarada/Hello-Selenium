package excelSheetYT;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
//import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import logger.LoggerLoad;


public class WriteInExcel {
        
	    //private static final CellType NUMERIC = null;
		//private static final CellType STRING = null;

 public static void writeExcelSheet() throws IOException { 
	
	 XSSFWorkbook workbook = new XSSFWorkbook(); 
	 XSSFSheet worksheet = workbook.createSheet("Sheet 1");
		  
		  int rowNum = 0; //iterating row
		  for(int i=1;i<=10;i++)//incrementing row by 1 
		  { 
		  Row row = worksheet.createRow(rowNum++); 
		  int colNum = 0; //iterating column
		  for(int j =1; j<=10;j++)
		  { //incrementing column by 1 
	      Cell cell = row.createCell(colNum++); //set cell value is to write value, need to select the type based on data type 
	      cell.setCellValue("Row"+i+ "Column"+j);// to write values in the row/cell
		     } 
		  } // selecting location to save the excel sheet
		  //LoggerLoad.info(System.getProperty("user.dir")); 
		  String path = System.getProperty("user.dir")+  "\\src\\test\\resources\\ExcelTest\\Test.xlsx"; 
		  File Excelfile = new File(path); 
		  FileOutputStream Fos = null;   
		  try
		  { 
		  Fos = new FileOutputStream(Excelfile);// to write in excel sheet 
		  workbook.write(Fos);
		  workbook.close(); //To close excel sheet after writing is done but it should be used only at the end of the program.
		  } 
		  catch (FileNotFoundException e) 
		  {
		  
		  e.printStackTrace(); 
		  } 
		  finally
		  { 
			  Fos.close();
		       } 
		  }
    public static void main(String[] args) throws IOException {
    	writeExcelSheet();	
	}
	
   }


