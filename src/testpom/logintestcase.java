package testpom;
import org.testng.annotations.Test;
import configuration.excelread;
import pagespom.baseclass;
import pagespom.constants;
import pagespom.loginpage;

public class logintestcase extends baseclass {
	loginpage obj;
	@Test(groups = {"loginpage"})
	public void passvalues() 
	{
		
	obj=new loginpage(driver);
	Object[][] loginData = excelread.getExcelData(constants.excelFilePath, "Sheet1");
	 for (Object[] credentials : loginData) {
         String username = credentials[0].toString();
         String password = credentials[1].toString();
	obj.setvalues(username, password);
	obj.loginclick();
	obj.refresh();
	
	 }
	}
	
}

