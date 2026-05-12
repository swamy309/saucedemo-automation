package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class InvalidPasswordTest extends BaseTest {

    @Test
    public void invalidPasswordTest() {

        LoginPage lp = new LoginPage(driver);

        lp.login("standard_user", "wrong_password");

        String error = lp.getErrorMessage();

        System.out.println(error);

        Assert.assertTrue(error.contains("Username and password"));
    }
}