package com.cbt.pages.damira;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//ul[@id='navTop']//a[@data-sso-source='login']")
	public WebElement login;

	@FindBy(name = "username")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	public WebElement loginBtn;

	public void logIn() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		login.click();
		username.sendKeys(ConfigurationReader.getProperty("username"));
		password.sendKeys(ConfigurationReader.getProperty("password"));
		loginBtn.click();
	}
}