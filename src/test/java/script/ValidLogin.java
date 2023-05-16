package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	
	@Test(priority = 1)
	public void testValidLogin() {
		
		String un = Excel.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw = Excel.getData(XL_PATH, "ValidLogin", 1, 1);
		
		LoginPage loginPage=new LoginPage(driver);
		EnterTimeTrackPage homePage=new EnterTimeTrackPage(driver);
		
//		1.enter valid username
		loginPage.setUserName(un);
//		2.enter valid password
		loginPage.setPassword(pw);
//		3.click login button
		loginPage.clickLoginButton();
//		4.verify home page is displayed or not
		boolean result = homePage.verifyHomePageIsDisplayed(wait);
		Assert.assertTrue(result);
		
	}

}
