package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadd {     public static Object[][] getData(String sheetName) throws IOException {
    File excelFile = new File("./TestData.xlsx");
    FileInputStream fis = new FileInputStream(excelFile);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet(sheetName);

    int rows = sheet.getPhysicalNumberOfRows();
    int cols = sheet.getRow(0).getLastCellNum();  // Get the number of columns from the first row

    // Create a 2D array to hold data
    Object[][] data = new Object[rows - 1][cols];  // Exclude the header row

    // Loop through rows and columns to populate the data array
    for (int i = 1; i < rows; i++) {  // Start from row 1 to skip the header
        XSSFRow row = sheet.getRow(i);
        for (int j = 0; j < cols; j++) {
            XSSFCell cell = row.getCell(j);
            if (cell != null) {
                data[i - 1][j] = getCellValue(cell);  // Handle different cell types
            } else {
                data[i - 1][j] = "";  // Handle empty cells
            }
        }
    }

    workbook.close();
    fis.close();
    return data;
}

// Helper method to handle different cell types
private static Object getCellValue(XSSFCell cell) {
    CellType cellType = cell.getCellType();
    switch (cellType) {
        case STRING:
            return cell.getStringCellValue();
        case NUMERIC:
            return String.valueOf(cell.getNumericCellValue());  // Convert numeric to String
        case BOOLEAN:
            return String.valueOf(cell.getBooleanCellValue());
        case FORMULA:
            return cell.getCellFormula();
        default:
            return "";
    }


}
}


//    public Object[][] getData(String sheetName, String rowName) throws IOException {
//        File excelFile = new File("./TestData.xlsx");
//        FileInputStream fis = new FileInputStream(excelFile);
//        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//        XSSFSheet sheet = workbook.getSheet(sheetName);
//        int rows = sheet.getPhysicalNumberOfRows();
//        XSSFRow row1;
//        XSSFCell cell1;
//        int rowNumber = 0;
//        for (int i = 0; i < rows; i++) {
//            row1 = sheet.getRow(i);
//            XSSFCell cell = row1.getCell(0);
//            String cellvalueString = cell.getStringCellValue();
//            if (cellvalueString.equals(rowName)) {
//                rowNumber = i;
//
//                break;
//            }
//        }
//        int cols = sheet.getRow(rowNumber).getLastCellNum();
//        Object[][] data = new Object[1][cols - 1];
//        for (int j = 0; j < cols - 1; j++) {
//            cell1 = sheet.getRow(rowNumber).getCell(j + 1);
//            data[0][j] = cell1.getStringCellValue();
//
//        }
//        workbook.close();
//        fis.close();
//        return data;

