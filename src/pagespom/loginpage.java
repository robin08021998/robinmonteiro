package pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	
	
	By username=By.xpath("//*[@id=\"user-name\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By login =By.xpath("//*[@id=\"login-button\"]");
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setvalues(String username1 ,String password1) {
    driver.findElement(username).sendKeys(username1);
    driver.findElement(password).sendKeys(password1);
	}
	
	public void loginclick() {
	    driver.findElement(login).click();
		}
	public void refresh()
	{
		driver.navigate().refresh();
	}

}
