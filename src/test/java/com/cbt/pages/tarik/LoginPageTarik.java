package com.cbt.pages.tarik;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class LoginPageTarik {
	public LoginPageTarik() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//p[@class='flash']")
	public WebElement errorMsg ;
}

