package com.cbt.pages.oleksandr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class CardiovascularAddExercisePage {
	
	public CardiovascularAddExercisePage() {
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(xpath="//input[@id='search']")
	public WebElement searchExerciseInput;
	
	@FindBy(xpath="//input[@class='button']")
	public WebElement searchButton;
	
	
	
	
	

}