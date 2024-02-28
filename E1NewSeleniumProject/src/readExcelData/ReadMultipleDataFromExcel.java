package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i=1; i <=10; i++) {
		
		FileInputStream fis = new FileInputStream("./data/testData.xlsx"); // To Provide the path of excel file
		
		Workbook wb = WorkbookFactory.create(fis); // To make the file ready to read
		
		Sheet sheet = wb.getSheet("ipl"); // To get into the sheet
		
		Row row = sheet.getRow(i); // To get into the desired row
		
		Cell cell = row.getCell(0); // To get into desired cell/column
		
		String data = cell.getStringCellValue(); // To read the data/value from the cell
		
		System.out.println(data);
		
		}

	}

}
