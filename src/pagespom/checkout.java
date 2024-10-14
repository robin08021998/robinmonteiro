package pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkout {
	WebDriver driver;
	By firstname =By.xpath("//*[@id=\"first-name\"]");
	By lastname = By.xpath("//*[@id=\"last-name\"]");
	By zipcode = By.xpath("//*[@id=\"postal-code\"]");
	By cancel = By.xpath("//*[@id=\"cancel\"]");
	By continu = By.xpath("//*[@id=\"continue\"]");
	
	public checkout(WebDriver driver) {
		this.driver=driver;
		}
	
	public void inputfields (String first_name,String last_name, String zip_code)
	{
		driver.findElement(firstname).sendKeys(first_name);
		driver.findElement(lastname).sendKeys(last_name);
		driver.findElement(zipcode).sendKeys(zip_code);
		
	}
	public void continue_button()
	{
		driver.findElement(continu).click();
	}
	public void cancel_button()
	{
		driver.findElement(cancel).click();
	}
}
