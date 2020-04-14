package com.emprix.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	WebDriver d;
	
	public LoginPage(WebDriver d) {

		this.d = d; // Initialize the webdriver
		waitForLoader();
	}
	
	@FindBy(xpath="//input[@name='callback_0']")
	   WebElement userName;
	@FindBy(xpath="//input[@type='password']")
	   WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	   WebElement clickSignIn;
	
	public void login(String uname, String pass) {
		
		//waitForLoader();
		//explicitWait(userName);
		userName.sendKeys(uname);
		waitFor(3);
		password.sendKeys(pass);
		clickSignIn.click();
		
	}
    
}
