package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class interactions {

	public static void main(String[] args) {
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
	    driver.findElement(By.xpath("//*[@id=\"Accepted Elements\"]")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, 200)");
		/*WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		actions.doubleClick(sourceElement).perform();
		actions.dragAndDrop(sourceElement, targetElement).perform();*/
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.findElement(By.xpath("//*[@id=\"menu-miscellaneous-1\"]/li[3]/a")).click();
		WebElement name =driver.findElement(By.id("g2599-name"));
	    name.sendKeys("test name ");
	    actions.click(name)              
	       .keyDown(Keys.CONTROL)           
	       .sendKeys("a")                   
	       .sendKeys("c")                   
	       .keyUp(Keys.CONTROL)             
	       .perform();
	    WebElement mail =driver.findElement(By.id("g2599-email"));
	    actions.click(mail)              
	       .keyDown(Keys.CONTROL)           
	       .sendKeys("v")                   
	       .keyUp(Keys.CONTROL)             
	       .perform();
		
		
		
		
	}

}
