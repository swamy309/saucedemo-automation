package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class EmptyUsernameTest extends BaseTest {

    @Test(retryAnalyzer = utilities.RetryAnalyzer.class)
    public void emptyUsernameTest() {

        LoginPage lp = new LoginPage(driver);

        lp.login("", "secret_sauce");

        String error = lp.getErrorMessage();

        System.out.println(error);

        Assert.assertTrue(error.contains("Username is required"));
    }
}
