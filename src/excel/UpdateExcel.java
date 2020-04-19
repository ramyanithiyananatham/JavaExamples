package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This program illustrates how to update an existing Microsoft Excel document.
 * Append new rows to an existing sheet.//update specific cell
 *
 * @author www.codejava.net
 *
 */
public class UpdateExcel {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		// C://Users//User//Desktop//
		// String excelFilePath = "new.xlsx";

		try {
			System.out.println(" Creating input stream");
			FileInputStream inputStream = new FileInputStream("new.xlsx");
			Workbook workbook = WorkbookFactory.create(inputStream);
			// getSheetAt(0);
			Sheet sheet = workbook.getSheetAt(0);// ("first sheet");

			Object[][] bookData = { { "The Passionate Programmer", "Chad Fowler", 16 },
					{ "Software Craftmanship", "Pete McBreen", 26 },
					{ "The Art of Agile Development", "James Shore", 32 },
					{ "Continuous Delivery", "Jez Humble", 41 }, };

			int rowCount = sheet.getLastRowNum();
			System.out.println("rowcount" + rowCount);

			for (Object[] aBook : bookData) {
				Row row = sheet.createRow(++rowCount);

				int columnCount = 0;

				Cell cell = row.createCell(columnCount);
				cell.setCellValue(rowCount);//for serial number 1,2,3

				for (Object field : aBook) {
					cell = row.createCell(++columnCount);
					if (field instanceof String) {
						cell.setCellValue((String) field);
					} else if (field instanceof Integer) {
						cell.setCellValue((Integer) field);
					}
				}

			}
			
			//to update a specific cell
			sheet.getRow(3).getCell(2).setCellValue("c++");
			
			inputStream.close();

			FileOutputStream outputStream = new FileOutputStream("new.xlsx");
			workbook.write(outputStream);
			System.out.println("file is updated");
			workbook.close();
			outputStream.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
