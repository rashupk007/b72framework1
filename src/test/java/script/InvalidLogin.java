package script;

import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest {

	@Test(priority = 2)
	public void testInvalidLogin() {
		
		int rc=Excel.getRowCount(XL_PATH, "InvalidLogin");
		
		for (int i=1;i<=rc;i++) {
			String un = Excel.getData(XL_PATH, "ValidLogin", i, 0);
			String pw = Excel.getData(XL_PATH, "InvalidLogin", i, 1);
//			
			LoginPage loginPage=new LoginPage(driver);
			
//			1.enter valid username
			loginPage.setUserName(un);
//			2.enter valid password
			loginPage.setPassword(pw);
//			3.click login button
			loginPage.clickLoginButton();
//			4.verify error message is displayed or not
			boolean result = loginPage.verifyErrMsgIsDisplayed(wait);
			Assert.assertTrue(result);
		}
		
	}
	
}
