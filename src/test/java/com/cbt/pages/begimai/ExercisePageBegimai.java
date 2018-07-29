package com.cbt.pages.begimai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class ExercisePageBegimai {
	
	public ExercisePageBegimai() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath="(//a[@class='nav_button'])[2]")
	public WebElement clickExercise;


}
