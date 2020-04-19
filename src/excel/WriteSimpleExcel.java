package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteSimpleExcel
{
	public static void main(String[] args) throws IOException
	{ //creating work book 
		XSSFWorkbook workbook = new XSSFWorkbook();
	
		//create sheet on the workbook , the HSSFSheethave private constructor 
	XSSFSheet sheet1 = workbook.createSheet("first sheet"); 
	XSSFSheet sheet2 = workbook.createSheet("second sheet");
//	workbook.removeSheetAt(2);  
		//create row in sheet1 Row 
	Row row0 = sheet1.createRow(0); 
	//Row row1 = sheet1.createRow(1); 
	//Row row2 = sheet1.createRow(2);
		//create cell in row 0 
	Cell cellA= row0.createCell(0);
		//setting cell value 
	cellA.setCellValue("RowCount");
	Cell cellB= row0.createCell(1); 
	cellB.setCellValue("Book");
	//repeating above step for other cells 
	Cell cellC= row0.createCell(2); 
	cellC.setCellValue("Author"); 
	Cell cellD= row0.createCell(3); 
	cellD.setCellValue("price"); 
	
	Object[][] bookData = {
             {"The Passionate Programmer", "Chad Fowler", 16},
             {"Software Craftmanship", "Pete McBreen", 26},
             {"The Art of Agile Development", "James Shore", 32},
             {"Continuous Delivery", "Jez Humble", 41},
     };

     int rowCount = sheet1.getLastRowNum();

     for (Object[] aBook : bookData) {
         Row row = sheet1.createRow(++rowCount);

         int columnCount = 0;
          
         Cell cell = row.createCell(columnCount);
         cell.setCellValue(rowCount);
          
         for (Object field : aBook) {
             cell = row.createCell(++columnCount);
             if (field instanceof String) {
                 cell.setCellValue((String) field);
             } else if (field instanceof Integer) {
                 cell.setCellValue((Integer) field);
             }
         }
         
     }
	
	
	//creating file stream 
	File f =  new File("new.xlsx"); 
	//chaining output stream to path 
	FileOutputStream fo= new FileOutputStream(f); 
	//Writing workbook to output stream 
	workbook.write(fo); 
	//closing stream 
	fo.close(); 
	System.out.println("excel file is writtern");
	workbook.close();
	}
}