package configuration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;


public class excelread {
	 
	  public static  Object[][] getExcelData(String filePath, String sheetName) {
	        Object[][] data = null;
	        try {
	            FileInputStream fis = new FileInputStream(filePath);
	            XSSFWorkbook workbook = new XSSFWorkbook(fis);
	            XSSFSheet sheet = workbook.getSheet(sheetName);

	            int rowCount = sheet.getPhysicalNumberOfRows();
	            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

	            data = new Object[rowCount - 1][colCount];  // Skipping the header row

	            for (int i = 1; i < rowCount; i++) {  
	                XSSFRow row = sheet.getRow(i);
	                for (int j = 0; j < colCount; j++) {
	                    data[i - 1][j] = row.getCell(j).toString();
	                }
	            }

	            workbook.close();
	          //  fis.close();
	        } catch (IOException e) {
	            
	        }

	        return data;
	    }

	
	}

	
	

	
	        
	      

	      


