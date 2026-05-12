package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LockedUserTest extends BaseTest {

	@Test
	public void lockedUserTest() {

		LoginPage lp = new LoginPage(driver);

		lp.login("locked_out_user", "secret_sauce");

		String error = lp.getErrorMessage();

		System.out.println(error);

		Assert.assertTrue(error.contains("locked out"));
	}
}