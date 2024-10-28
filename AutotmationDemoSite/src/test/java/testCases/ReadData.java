package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.ExcelReadd;

public class ReadData {


	
	@Test(dataProvider="readfrom")
	public void Readdata(String Username,String Password) {
		System.out.println("data From Excel  :"+Username+Password);
		
	}
	@DataProvider(name="readfrom")
    public Object[][] excelDataProvider() throws IOException {
        // Get data from Excel using ExcelReadd class
        // Example: Sheet1 and RowName1 are the sheet name and row name you want to read from
        return ExcelReadd.getData("Sheet1");
    }
}
