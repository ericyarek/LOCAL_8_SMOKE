package com.cbt.tests.tarik;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.cbt.pages.tarik.*;

import com.cbt.tests.TestBase;
import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class NegativeLoginFunctionalityTarik extends TestBase{

	String username = "rob123QW@gmail.com";
	String password = "yeggdf123";

	@Test(groups= {"smoke"})
	public void invalid_password_testing() {
		extentLogger = report.createTest("invalid_password_testing");
	HomePageTarik homepage = new HomePageTarik();
	LoginPageTarik loginpage = new LoginPageTarik();
	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	homepage.signInButton.click();
	homepage.userName.sendKeys(username);
	homepage.password.sendKeys(password);
	homepage.loginbutton.click();
	
	BrowserUtils.waitForVisibility(loginpage.errorMsg, 4);
	String actual= loginpage.errorMsg.getText();
	System.out.println(actual);
	String expected = "Incorrect username or password";
	
	assertTrue(actual.contains(expected), "you passed valid credentials");
	extentLogger.pass("Message is shown");
	}

}