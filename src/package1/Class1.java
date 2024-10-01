package package1;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert; 

public class Class1 {
	
	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver ;
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	Thread.sleep(4000);
	WebElement title=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	String imageTitle = title.getAttribute("title");
	System.out.println(imageTitle);
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("BOSS");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("blackforest444");
	WebElement pass=driver.findElement(By.xpath("//*[contains(@type,'password')]"));
	WebElement repass=driver.findElement(By.xpath("//*[contains(@id,'newpasswd1')]"));
	pass.sendKeys("mypassword");
	repass.sendKeys("mypasswor");
	String password =pass.getAttribute("value");                             //password checking assertion
	String repassword=repass.getAttribute("value");
	SoftAssert softAssert = new SoftAssert();
    softAssert. assertEquals(password, repassword , "Passwords do not match!");
	driver.findElement(By.className("nomargin")).click();
	WebElement city =driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
	Select dd = new Select(city);
	dd.selectByIndex(2);
	driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
	Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	String mainWindowHandle = driver.getWindowHandle(); 
	driver.findElement(By.linkText("privacy policy")).click();
	Set<String> allWindowHandles = driver.getWindowHandles();                //multiple window handling
	for (String handle : allWindowHandles) {
	    if (!handle.equals(mainWindowHandle)) {
	        driver.switchTo().window(handle);
	    }}
	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	Thread.sleep(5000);
	driver.close();
	driver.switchTo().window(mainWindowHandle);

	Thread.sleep(4000);
	driver.close();
	softAssert.assertAll();                                                  // This will report any failures after all assertions are done
	
	}	
}
	

	