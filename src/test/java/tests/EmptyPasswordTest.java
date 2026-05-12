package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class EmptyPasswordTest extends BaseTest {

    @Test
    public void emptyPasswordTest() {

        LoginPage lp = new LoginPage(driver);

        lp.login("standard_user", "");

        String error = lp.getErrorMessage();

        System.out.println(error);

        Assert.assertTrue(error.contains("Password is required"));
    }
}