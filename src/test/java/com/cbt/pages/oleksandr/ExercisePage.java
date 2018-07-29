package com.cbt.pages.oleksandr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class ExercisePage {
	
	public ExercisePage() {
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(xpath="(//a[@class='add_exercise'])[1]")
	public WebElement cardioVascularAddExerciseButton;
	

}
