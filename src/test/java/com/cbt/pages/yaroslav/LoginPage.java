package com.cbt.pages.yaroslav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	@FindBy(xpath = "//h2[.='Member Login']")
	public WebElement memberLoginText;
	
	@FindBy(name = "username")
	public WebElement emailAddress;


	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	public WebElement loginButton;
	

	public void login(String uid, String pwd) {
		emailAddress.sendKeys(uid);
		password.sendKeys(pwd);
		loginButton.click();
	}

}