package com.cbt.pages.yaroslav;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class MainPage {
	
	public MainPage(){
	PageFactory.initElements (Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//li/a[.='Log In']")
	public WebElement logIn;

}
