package com.cbt.pages.oleksandr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class MyAccPage {

	public MyAccPage() {
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(xpath="//a[@class='gray button ember-view'][1]")
				   
	public WebElement addExerciseButton;
	
}
