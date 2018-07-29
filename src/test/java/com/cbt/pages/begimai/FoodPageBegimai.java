package com.cbt.pages.begimai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class FoodPageBegimai {
	
	public FoodPageBegimai() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="(//a[@class='ember-view'])[1]")
	public WebElement foodButton;

	@FindBy(xpath="(//a[@class='add_food'])[1]")
	public WebElement addfoodButton;
	
	@FindBy(xpath="//input[@id='search']")
	public WebElement searchbox;

	@FindBy(xpath="//input[@value='Search']")
	public WebElement searchButton;
	
	
}
