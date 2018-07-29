package com.cbt.tests.begimai;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.cbt.pages.begimai.*;

import com.cbt.tests.TestBase;
import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class MatchingFoodResultsTest extends TestBase {

	String username = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	FoodPageBegimai food = new FoodPageBegimai();
	SearchResultsPageBegimai searchpage = new SearchResultsPageBegimai();
	FoodDiaryPagesBegimai foodAdded = new FoodDiaryPagesBegimai();

	@Test(groups= {"smoke"})
	public void getTitleTest() {
		extentLogger = report.createTest("Positive Matching FoodResults Test");
		
		HomePageBegimai homepage = new HomePageBegimai();
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		homepage.signInButton.click();
		homepage.userName.sendKeys(username);
		homepage.password.sendKeys(password);
		homepage.loginbutton.click();

		food.foodButton.click();
		assertTrue(driver.getTitle().contains("Food Diary"));

		food.addfoodButton.click();
		BrowserUtils.waitFor(3);
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("Free Calorie Counter"));
		food.searchbox.sendKeys("Spaghetti, Cooked");
		food.searchButton.click();

		assertTrue(searchpage.searchResult.getText().contains("Spaghetti, Cooked"));

		BrowserUtils.waitFor(3);

		List<WebElement> match = driver.findElements(By.xpath("//ul[@id='matching']//li"));
		Random rand = new Random();
		int index = rand.nextInt(match.size());

		match.get(index).click();
		assertTrue(searchpage.fooddescription.getText().contains(("Spaghetti")));
		assertTrue(searchpage.fooddescription.getText().toLowerCase().contains(("cooked")));

		searchpage.nutritionBtn.click();
		System.out.println(searchpage.fancybox.getText());
		assertTrue(searchpage.fancybox.getText().contains("Nutrition Facts"));
		BrowserUtils.waitForClickablility(searchpage.fancyBoxClose, 5);
		searchpage.fancyBoxClose.click();

		BrowserUtils.waitFor(3);
		searchpage.addToDiary.click();
		BrowserUtils.waitFor(5);

		foodAdded.addedFoodInfo.getText();

		BrowserUtils.waitFor(5);

		ExercisePageBegimai exerciseBtn = new ExercisePageBegimai();
		exerciseBtn.clickExercise.click();

		System.out.println(Driver.getDriver().getTitle());
		extentLogger.pass("Verified food title");
	}

}
