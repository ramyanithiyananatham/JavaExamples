package excel;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingPoi {
	//hssf model/ previous model
		public static void main(String[] args) throws InvalidFormatException, IOException 
		{
			//input file stream
			File f =  new File("new.xlsx"); 
			//connecting to input stream 
			FileInputStream fi= new FileInputStream(f); 
			//connecting workbook to input stream 
			Workbook workbook= WorkbookFactory.create(fi);
		
		//get the first sheet 
			org.apache.poi.ss.usermodel.Sheet sheet0 = workbook.getSheetAt(0); 
			System.out.println(sheet0.getSheetName());
			//get the first 	row 
			/*Row row0 = sheet0.getRow(0);
		//get the first cell 
			Cell cell0 = row0.getCell(0); 
			Cell cell1 = row0.getCell(1); 
			Cell cell2 = row0.getCell(2);
		System.out.println("cell 0 is=--> "+cell0+" cell 1 is -->"+cell1 +" cell 2 is -->" + cell2);
		*/
			for(Row row:sheet0)
			{
				for(Cell cell:row )
				{
					switch(cell.getCellType())
					{
					case STRING:
						System.out.print(cell.getStringCellValue()+","+"\t");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+","+"\t");
						break;
					case BLANK:
						System.out.print("Blank cell"+"\t");
						break;
					case BOOLEAN:
						break;
					case ERROR:
						break;
					case FORMULA:
						break;
					case _NONE:
						break;
					default:
						break;
					}
			
			}System.out.println();

			}
		}
}
