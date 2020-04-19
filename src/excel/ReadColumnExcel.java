package excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadColumnExcel {

	public static void main(String[] args) throws Exception {
		// test file is located in your project path
		File f = new File("new.xlsx");
		FileInputStream fileIn = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fileIn);

		// get the first sheet
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);

		String columnWanted = "Book";
		int rowNeeded = 2;
		ReadColumnExcel r = new ReadColumnExcel();
		r.readColumn(fileIn, sheet, columnWanted);
		r.readRow(fileIn, sheet, rowNeeded);
	}

	void readColumn(FileInputStream fileIn, Sheet sheet, String columnWanted) {
		Integer columnNo = null;
		// output all not null values to the list
		List<String> cells = new ArrayList<String>();
		// ArrayList<String> list = (ArrayList) ois.readObject();
		Row firstRow = sheet.getRow(0);
//count of all the headers in first row
		for (Cell cell : firstRow) {
			if (cell.getStringCellValue().equals(columnWanted)) {
				columnNo = cell.getColumnIndex();
				System.out.println(" column identified" + columnNo);
			}
		}

		if (columnNo != null) {
			int i = 0;
			//iterate for each row
			for (Row row : sheet) {
				Cell c = row.getCell(columnNo);

				if (c == null || c.getCellType() == null)// ==BLANK:)//==c.CELL_TYPE_ BLANK)
				{
					// Nothing in the cell in this row, skip it
				} else {
					cells.add(c.getStringCellValue());
					System.out.println(" I am reading wanted column value " + i + " " + c.getStringCellValue());
					i++;
				}
			}
		} else {
			System.out.println("could not find column " + columnWanted + " in first row of " + fileIn.toString());
		}

	}

	void readRow(FileInputStream fileIn, Sheet sheet, int rowWanted) {

		Row row = sheet.getRow(rowWanted);

		for (Cell cell : row) {
			switch (cell.getCellType()) {
			case STRING:
				System.out.print(cell.getStringCellValue() + "," + "\t");
				break;
			case NUMERIC:
				System.out.print(cell.getNumericCellValue() + "," + "\t");
				break;
			case BLANK:
				System.out.print("Blank cell" + "\t");
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
		}

	}
}