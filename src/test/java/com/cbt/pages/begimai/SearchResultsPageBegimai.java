package com.cbt.pages.begimai;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.Driver;

public class SearchResultsPageBegimai {

	public SearchResultsPageBegimai() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//ul[@id='matching']")
	public WebElement searchResult;

	@FindBy(xpath = "(//a[@class='button verified-button'])[2]")
	public WebElement nutritionBtn;

	@FindBy(id = "nutrition_facts")
	public WebElement fancybox;

	@FindBy(xpath = "(//p[@class='food-description'])[2]")
	public WebElement fooddescription;
	
	@FindBy(xpath="//*[@id=\"fancybox-close\"]")
	public WebElement fancyBoxClose;

	@FindBy(id="food_entry_quantity")
	public WebElement something;
	
	@FindBy(xpath="(//input[@value='Add Food To Diary'])[2]")
	public WebElement addToDiary;

}