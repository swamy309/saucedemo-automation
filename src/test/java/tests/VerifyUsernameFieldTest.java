package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class VerifyUsernameFieldTest extends BaseTest {

	@Test
	public void verifyUsernameFieldTest() {

		LoginPage lp = new LoginPage(driver);

		boolean status = lp.usernameFieldDisplayed();

		System.out.println("Username Field Displayed : " + status);

		Assert.assertTrue(status);
	}
}
