package pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class homepage {
	WebDriver driver;

	By addtocart=By.name("add-to-cart-sauce-labs-backpack");
	By filter=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");  
	By hamburgermenu=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");         
	By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	public homepage(WebDriver driver) {
		this.driver=driver;
	}

	

public void addtocartbutton()
{
	driver.findElement(addtocart).click();
}
public void filter_operation(int value)
{
	WebElement filters=driver.findElement(filter);
	filters.click();
	Select sf=new Select(filters);
	sf.selectByIndex(value);
	
}
public void cart_click()
{
	driver.findElement(cart).click();;
}
public void hamburger_menu()
{
	driver.findElement(hamburgermenu).click();;
}
public void logout_click()
{
	driver.findElement(logout).click();
}
}


