package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class VerifyURLTest extends BaseTest {

	@Test
	public void verifyURLTest() {

		LoginPage lp = new LoginPage(driver);

		lp.login("standard_user", "secret_sauce");

		String url = driver.getCurrentUrl();

		System.out.println(url);

		Assert.assertTrue(url.contains("inventory"));
	}
}
