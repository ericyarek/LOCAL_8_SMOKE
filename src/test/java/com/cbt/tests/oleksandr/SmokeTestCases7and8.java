package com.cbt.tests.oleksandr;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.cbt.pages.oleksandr.*;

import com.cbt.tests.TestBase;
import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class SmokeTestCases7and8 extends TestBase {
	@Ignore
	@Test
	public void verify_title_exerciseDiary() {

		extentLogger = report.createTest("Verify Exercise Diary test");

		// info () --> to print a message
		extentLogger.info("entering user credentials");

		HomePage homePage = new HomePage();
		homePage.logInTab.click();
		homePage.userName.sendKeys(ConfigurationReader.getProperty("username"));
		homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
		homePage.loginButton.click();

		MyAccPage myAccPage = new MyAccPage();

		myAccPage.addExerciseButton.click();

		String actualTitle = driver.getTitle();

		assertTrue(actualTitle.contains("Exercise Diary"));

	}

	@Test(groups = { "smoke" })
	public void verify_running() {

		extentLogger = report.createTest("Verify running test");

		// info () --> to print a message
		extentLogger.info("entering user credentials");

		HomePage homePage = new HomePage();
		homePage.logInTab.click();
		homePage.userName.sendKeys(ConfigurationReader.getProperty("username"));
		homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
		homePage.loginButton.click();

		MyAccPage myAccPage = new MyAccPage();
		BrowserUtils.waitForVisibility(myAccPage.addExerciseButton, 5);
		myAccPage.addExerciseButton.click();

		String actualTitle = driver.getTitle();

		assertTrue(actualTitle.contains("Exercise Diary"));

		ExercisePage exercisePage = new ExercisePage();

		exercisePage.cardioVascularAddExerciseButton.click();

		WebElement textAddExercise = Driver.getDriver().findElement(By.xpath("//h2[.='Add Exercise']"));
		WebElement textSearchByName = Driver.getDriver()
				.findElement(By.xpath("//h3[.='Search our exercise database by name:']"));

		assertTrue(textAddExercise.isDisplayed());
		assertTrue(textSearchByName.isDisplayed());

		CardiovascularAddExercisePage cardiovascularAddExercisePage = new CardiovascularAddExercisePage();

		cardiovascularAddExercisePage.searchExerciseInput.sendKeys("run");
		cardiovascularAddExercisePage.searchButton.click();

		String runningText = driver.findElement(By.xpath("//a[@data-index='1']")).getText();

		assertTrue(runningText.contains("Running"));
		extentLogger.pass("Running is displayed ");
	}

}