package com.cbt.pages.tarik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class HomePageTarik {
	public HomePageTarik() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//ul[@id='navTop']//a)[42]")
	public WebElement signInButton;
	
	@FindBy(name = "username")
	public WebElement userName;
	
	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//input[@class='expand-width']")
	public WebElement loginbutton;
}