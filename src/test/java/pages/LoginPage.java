package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 WebDriver driver;

	    // Constructor
	    public LoginPage(WebDriver driver) {

	        this.driver = driver;
	    }

	    // Locators
	    By username = By.id("user-name");

	    By password = By.id("password");

	    By loginBtn = By.id("login-button");

	    By errorMessage =
	            By.xpath("//h3[@data-test='error']");

	    // Login Method
	    public void login(String uname, String pwd) {

	        driver.findElement(username).clear();
	        driver.findElement(username).sendKeys(uname);

	        driver.findElement(password).clear();
	        driver.findElement(password).sendKeys(pwd);

	        driver.findElement(loginBtn).click();
	    }

	    // Get Error Message Method
	    public String getErrorMessage() {

	        return driver.findElement(errorMessage).getText();
	    }

	    // Login Button Display Check
	    public boolean loginButtonDisplayed() {

	        return driver.findElement(loginBtn).isDisplayed();
	    }

	    // Username Field Display Check
	    public boolean usernameFieldDisplayed() {

	        return driver.findElement(username).isDisplayed();
	    }

}
