package com.cbt.pages.begimai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class FoodDiaryPagesBegimai {
	
	public FoodDiaryPagesBegimai() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="(//a[@class='js-show-edit-food'])[1]")
	public WebElement addedFoodInfo;
	

	
}
