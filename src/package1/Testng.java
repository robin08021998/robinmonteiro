package package1;

import org.testng.annotations.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



       
public class Testng {
	   WebDriver driver;
	  
	    
		@BeforeMethod()
	    public void openbrowser() {
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		
		    
		    }
		@Test()
	    public void login() {
			
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys();
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			}
		@Test()
		public void alert() { 
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		 @AfterMethod()
			 public void windowclose()
			 {
			 driver.close();
			 }
		}	




		 
	




	


