package com.cbt.tests.yaroslav;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.cbt.pages.yaroslav.HomePage;
import com.cbt.pages.yaroslav.LoginPage;
import com.cbt.pages.yaroslav.MainPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class LoginTests extends TestBase {
	
	MainPage mainPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@Test (groups= {"smoke"})
	public void launchApllicationTest() {
		extentLogger = report.createTest("Positive launch apllication test");
		extentLogger.info("launching apllication");
		assertEquals(Driver.getDriver().getTitle(), "Free Calorie Counter, Diet & Exercise Journal | MyFitnessPal.com");
		extentLogger.pass("Verified Title of MyFitnessPal.com");
	}
	
	
	@Test (groups= {"smoke"})
	public void positiveLoginFunctionalityTest() {
		mainPage = new MainPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
	
		extentLogger = report.createTest("Test Login functionality");
		extentLogger.info("launching apllication");
		
		mainPage.logIn.click();
		extentLogger.info("Click Log In ");
		assertTrue(loginPage.memberLoginText.getText().equals("Member Login"));
		
		loginPage.login("rob123QW@gmail.com", "1qazxsw2");
		String expectedAcc = ConfigurationReader.getProperty("username").substring(0, ConfigurationReader.getProperty("username").indexOf("@"));
		assertEquals(homePage.accountName.getText(), expectedAcc);
		
		extentLogger.pass("Verified Click Log In button");
	}
	
}
