package com.cbt.pages.oleksandr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(linkText = "Log In")
	public WebElement logInTab;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	public WebElement loginButton;

}
