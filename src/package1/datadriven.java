package package1;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	

	  WebDriver driver;
	  {
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  }
	  

    // Specify the Excel file path and sheet name
    private static final String EXCEL_FILE_PATH = "C:\\Users\\Robinm\\Downloads\\test data for automation.xlsx";
    private static final String SHEET_NAME = "Sheet1";
    
    @DataProvider(name = "excelData")
    public Object[][] getDataFromExcel() throws IOException {
        return utility.getExcelData(EXCEL_FILE_PATH, SHEET_NAME);
        }
    
        @Test(dataProvider = "excelData")
        public void login(String username, String password) {
			System.out.println("Testing with Username: " + username + " and Password: " + password);
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			driver.navigate().refresh();
        }
			
			@AfterMethod()
			public void close ()
			{
				driver.close();
			}
        
			

}
    
