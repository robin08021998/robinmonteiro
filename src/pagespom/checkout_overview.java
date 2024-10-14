package pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkout_overview {
	WebDriver driver;
	By finish=By.xpath("//*[@id=\"finish\"]");
	By cancel=By.xpath("//*[@id=\"cancel\"]");
	public checkout_overview(WebDriver driver) {
		this.driver=driver;
		}
	public void cancel_button()
	{
		driver.findElement(cancel).click();
	}
	public void finish_button() {
		driver.findElement(finish).click();
	}
}
