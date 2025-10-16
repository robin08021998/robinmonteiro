package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class emvigotestcase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.get("https://emvigotech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-6576\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-5633\"]/a")).click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(250);
		driver.findElement(By.xpath("//*[@id=\"post-1118\"]/div/div/div[2]/div/div/div[1]/a")).click();
		WebElement title =driver.findElement(By.xpath("//*[@id=\"post-5531\"]/div/div/div[2]/div/div[1]/div[1]/div/h2"));
		WebElement description=driver.findElement(By.xpath("//*[@id=\"post-5531\"]/div/div/div[2]/div/div[1]/div[3]/div/p"));
		String des=description.getText();
		String text=title.getText();
		System.out.println(text);
		System.out.println(des);
		driver.close();
		
		

	}

}
