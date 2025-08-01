package AdvanceScenarios_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting_Excell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		// Create Object for File Input Stream
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		
		// Open the Excell in readable Format
		
		Workbook wb = WorkbookFactory.create(fis);
		
		// Get the Control of Sheet
		
		Sheet sh = wb.getSheet("Sheet1");
		
		// Get the Control of Row
		
		Row row = sh.getRow(0);
		
		// Get the Control of Cell
		
		Cell cell = row.getCell(0);
		
		// Read the Value
		
		String BROWSER = cell.getStringCellValue();
		
		//Close the Workbook
		
		wb.close();
		
		System.out.println(BROWSER);
		

	}

}
