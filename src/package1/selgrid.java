package package1;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class selgrid {
	 static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		   
		        DesiredCapabilities capabilities = new DesiredCapabilities();
		        capabilities.setBrowserName("chrome");  
		        driver = new RemoteWebDriver(new URL("http://localhost:4444/ui/#"), capabilities);
		        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	            driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("testname");
	            
	
		    
	
}
}
