package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class VerifyInventoryPageTest extends BaseTest {

	@Test(retryAnalyzer = utilities.RetryAnalyzer.class)
	public void verifyInventoryPageTest() {

		LoginPage lp = new LoginPage(driver);

		lp.login("standard_user", "secret_sauce");

		String title = driver.getTitle();

		System.out.println(title);

		Assert.assertTrue(title.contains("Swag Labs"));
	}
}
