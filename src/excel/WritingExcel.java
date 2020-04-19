package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {
	public static void main(String[] args) throws IOException {
		
		  XSSFWorkbook workbook = new XSSFWorkbook(); 
		  
	      XSSFSheet sheet0 = workbook.createSheet("FirstSheet");
	/*     Row rowo=   sheet0.createRow(0);
	     Cell cellA= rowo.createCell(0);
	     Cell cellB= rowo.createCell(1);
	     cellA.setCellValue("firstcell");
	     cellB.setCellValue("Secondcell");*/
	      for(int rows=0; rows<10;rows++)
	      {Row row=   sheet0.createRow(rows);
	      for(int cols=0;cols<10;cols++)
	      {
	    	  Cell cell= row.createCell(cols);
	    	  cell.setCellValue((int)(Math.random()*100));
	      }
	    	  
	    	  
	      }
	      
	     // connecting streams
	      File f =  new File("new.xlsx"); 
		  	FileOutputStream fo= new FileOutputStream(f); 
		  	workbook.write(fo);
	     fo.close();
	     workbook.close();
	     System.out.println("excel file is writtern");
	}
}