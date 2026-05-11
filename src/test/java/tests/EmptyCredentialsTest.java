package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class EmptyCredentialsTest extends BaseTest {

    @Test(retryAnalyzer = utilities.RetryAnalyzer.class)
    public void emptyCredentialsTest() {

        LoginPage lp = new LoginPage(driver);

        lp.login("", "");

        String error = lp.getErrorMessage();

        System.out.println(error);

        Assert.assertTrue(error.contains("Username is required"));
    }
}