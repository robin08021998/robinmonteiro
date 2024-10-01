package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("frame1");
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//*[@id=\"id4\"]/div/input")).sendKeys("frame4");
        driver.switchTo().defaultContent();
        WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
        driver.switchTo().frame(frame3);
        WebElement iframe3=driver.findElement(By.xpath("/html/body/center/iframe"));
        driver.switchTo().frame(iframe3);
       // driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[3]/div/span/div/div/div[1]/input")).sendKeys("others");
          driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
        
	}   
	

}
