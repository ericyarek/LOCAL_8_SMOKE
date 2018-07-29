package com.cbt.pages.yaroslav;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	@FindBy(xpath = "//a[@class='user-2']")
	public WebElement accountName;
	



}
