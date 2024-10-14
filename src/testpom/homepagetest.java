package testpom;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pagespom.baseclass;
import pagespom.homepage;
public class homepagetest extends baseclass {
	homepage hoobj;
	
	@Test(dependsOnGroups = {"init"})
	public void actions ()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		hoobj=new homepage(driver);	
	
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		hoobj.filter_operation(3);
		hoobj.addtocartbutton();
		hoobj.cart_click();
		
		
		
	}

}
