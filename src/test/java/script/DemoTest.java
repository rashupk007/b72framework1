package script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;

public class DemoTest extends BaseTest {
	
	@Test
	public void demoTest1() {
		
		String data = Excel.getData(XL_PATH, "sheet1", 1, 0);
		Reporter.log("Test Data: "+data,true);
		Reporter.log(driver.getTitle(),true);
		
		
	}

}
