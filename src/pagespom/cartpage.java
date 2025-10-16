package pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {
	WebDriver driver;
	By continuepage=By.xpath("//*[@id=\"continue-shopping\"]");
	By checkout=By.xpath("//*[@id=\"checkout\"]");
	By remove=By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
			
public cartpage(WebDriver driver) {
	this.driver=driver;
	}
public void continue_button()
{
	driver.findElement(continuepage).click();
}
public void checkout_button()
{
	driver.findElement(checkout).click();;
}
public void remove_button()
{
	driver.findElement(remove).click();;
}

}
