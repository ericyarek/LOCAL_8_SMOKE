package com.cbt.pages.damira;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class LogOutDamira {
	public LogOutDamira() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//ul[@id='navTop']//a[.='Log Out']")
	public WebElement logOutBtn;
	
	@FindBy(xpath = "(//div[@class='member-login']//h2[.='Member Login'])[1]")
	public WebElement memberLogInWindow;
}
