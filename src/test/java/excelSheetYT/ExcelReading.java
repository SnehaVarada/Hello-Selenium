package excelSheetYT;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
//import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import com.microsoft.schemas.office.visio.x2012.main.CellType;
//import logger.LoggerLoad;



public class ExcelReading {
	
	
	 
	public static void readExcelSheet() throws IOException {
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelTest\\Demo.xlsx";
		File Excelfile = new File(path);
		 
		FileInputStream Fis = new FileInputStream(Excelfile); //Only read 
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("Sheet 1");
		
		// As we don't know no.of rows to read so we create iterator to read all rows
		Iterator<Row> row = sheet.rowIterator(); 
		System.out.println(row);//to print row value
		//If it has next row go to it and read it
		while(row.hasNext()) {
			//Read rows
			Row currRow = row.next();// passes row after row
			//To read strings in columns, if we don't know the no.of columns
			Iterator<Cell> cell = currRow.cellIterator();//iterating over each column
			
			while (cell.hasNext())
			{
				Cell currCell = cell.next();
				  CellType ct =currCell.getCellType();
			     switch (ct) {
			     case NUMERIC:
						System.out.print(currCell.getNumericCellValue() + " ");
						break;
					case STRING:
						System.out.print(currCell.getStringCellValue() + " ");
						break;
			     }
				System.out.print(currCell.getStringCellValue()+ " ~ ");
			}
			System.out.println();	
			}
		Row newRow = sheet.createRow(12); // Create new Row to write in particular row/column
		Cell newCell = newRow.createCell(13); // to create new column
		newCell.setCellValue("Advi");
		FileOutputStream Fos = new FileOutputStream(Excelfile);
		workbook.write(Fos);
		
	 }
	
		public static void readExcelSheet1() throws IOException {

			String excelpath = "C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\ExcelTest\\Demo.xlsx";
			FileInputStream inputstream = new FileInputStream(excelpath);

			XSSFWorkbook workbook1 = new XSSFWorkbook(inputstream);
			XSSFSheet sheet = workbook1.getSheet("Sheet 1");
			int rowcount = sheet.getLastRowNum();
			
			for (int i = 0; i <= rowcount; i++) {
				int celCount = sheet.getRow(i).getLastCellNum();
				for (int j = 0; j < celCount; j++) {
					Cell cel = sheet.getRow(i).getCell(j);//Apache cell type
		           CellType ct = cel.getCellType(); 
					//CellType ct = cel.getCellType(); //Excel type
					switch (ct) {
					case NUMERIC:
						System.out.print(cel.getNumericCellValue() + " ");
						break;
					case STRING:
						System.out.print(cel.getStringCellValue() + " ");
						break;
					/*
					 * case 4: System.out.print(cel.getBooleanCellValue()+" "); break; case 3:
					 * System.out.print(" "+" "); break;
					 */
					default:
						System.out.print("inside the default..");
					}
				}
				System.out.println(" ");
			}
		}
	

public static void main(String[] args) throws IOException {
	//writeExcelSheet();
	readExcelSheet();
	//ereadExcelSheet1();
}



}
