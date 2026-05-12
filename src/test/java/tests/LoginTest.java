package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage lp;

	@Test
	public void loginTest() {

		lp = new LoginPage(driver);

		lp.login("standard_user", "secret_sauce");

		System.out.println("Valid Login Successful");

		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	}

}