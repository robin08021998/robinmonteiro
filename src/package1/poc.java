package package1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert; 

    public class poc {
	WebDriver driver ;
	WebElement pass;
	WebElement repass;
	@BeforeMethod()
    public void openbrowser() {
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
	}
	@Test()
	public void title() {
	WebElement title=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	String imageTitle = title.getAttribute("title");
	System.out.println(imageTitle);
	}
	@Test()
	public void inputfields() {
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("BOSS");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("blackforest444");
    pass=driver.findElement(By.xpath("//*[contains(@type,'password')]"));
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
	repass=driver.findElement(By.xpath("//*[contains(@id,'newpasswd1')]"));
	pass.sendKeys("mypassword");
	repass.sendKeys("mypasswor");
	}
	@Test()
	public void passwordcheck() {
	String password =pass.getAttribute("value");                             //password checking assertion
	String repassword=repass.getAttribute("value");
	SoftAssert softAssert = new SoftAssert();
    softAssert. assertEquals(password, repassword , "Passwords do not match!");
    softAssert.assertNotEquals(password, repassword ,"Passwords match!" );
    softAssert.assertAll(); 
	}
	@Test()
	public void checkbox() {
	driver.findElement(By.className("nomargin")).click();
	}
	@Test()
	public void dropdowns() {
	driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9998788734");
	WebElement date =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select date1 =new Select(date);
	date1.selectByValue("06");
	WebElement month =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select month1 =new Select(month);
	month1.selectByIndex(4);
	WebElement year =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select year1 =new Select(year);
	year1.selectByValue("2018");
	WebElement city =driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
	Select dd = new Select(city);
	dd.selectByIndex(2);
	}
	@Test()
	public void radiobutton() {
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
	}
    
	@Test()
	public void submit() {
	driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
	Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	}
	@AfterMethod
	public void close() {
	driver.close();
	                                                 
	}	
}
	

	
