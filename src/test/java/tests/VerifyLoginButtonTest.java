package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class VerifyLoginButtonTest extends BaseTest {

	@Test
	public void verifyLoginButtonTest() {

		LoginPage lp = new LoginPage(driver);

		boolean status = lp.loginButtonDisplayed();

		System.out.println("Login Button Displayed : " + status);

		Assert.assertTrue(status);
	}
}
