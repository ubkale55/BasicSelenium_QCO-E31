package AdvanceScenarios_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Create Object for FileInputStream
		FileInputStream fis = new FileInputStream("./src/test/resources/DDT.properties");
		
		//Create Object for file type
		Properties pObj = new Properties();
		
		//Load the File
		pObj.load(fis);
		
		// Read the Data using getProperty()
		
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		System.out.println("BROWSER"+"---> "+BROWSER);
		System.out.println("URL"+"---> "+URL);
		System.out.println("USERNAME"+"---> "+USERNAME);
		System.out.println("PASSWORD"+"---> "+PASSWORD);
		
		
		
      WorkbookFactory		
		
		
		
		

	}

}
