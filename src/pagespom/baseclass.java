package pagespom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclass {
	public static WebDriver driver;
	@BeforeTest
	public void initial ()
	{
	if (driver == null) {
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	}
	
	}
	
	@AfterTest
	
	public void close()
	{
		//driver.close();
	}

}
