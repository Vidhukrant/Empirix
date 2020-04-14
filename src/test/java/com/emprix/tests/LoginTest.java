package com.emprix.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.emprix.pages.LoginPage;

import utility.ConfigReader;



public class LoginTest extends BaseTest {
	LoginPage loginPage;
	public static ConfigReader Config= new ConfigReader();
	@Test(description="Login with valid credential")
	public void TC_01() {
		
	    loginPage = PageFactory.initElements(d, LoginPage.class);
		loginPage.login(Config.getDataFromConfig("Username"), Config.getDataFromConfig("Password"));
	}
	
	@Test(description="Login with invalid credential")
	public void TC_002() {
		loginPage = PageFactory.initElements(d, LoginPage.class);
		loginPage.login(Config.getDataFromConfig("InvalidUserName"), Config.getDataFromConfig("InvalidPassword"));
	}
	
	
}
