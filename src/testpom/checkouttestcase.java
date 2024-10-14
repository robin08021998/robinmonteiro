package testpom;
import org.testng.annotations.Test;

import configuration.excelread;
import pagespom.baseclass;
import pagespom.checkout;
import pagespom.constants;

public class checkouttestcase extends baseclass{
	checkout checkobj;
	@Test()
	public void passvalue() 
	{
	checkobj=new checkout(driver);
	Object[][] checkoutData = excelread.getExcelData(constants.excelFilePath, "Sheet2");
	 for (Object[] inputdata : checkoutData) {
         String firstname = inputdata[0].toString();
         String lastname = inputdata[1].toString();
         String zipcode = inputdata[2].toString();
	 checkobj.inputfields(firstname, lastname, zipcode);

}
	}
}
