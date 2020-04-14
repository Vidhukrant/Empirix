package com.emprix.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import utility.BrowserFactory;
import utility.ConfigReader;



public class BaseTest {
	
	public static WebDriver d;
	public static ConfigReader Config;
	
	@BeforeSuite
	public void setUpSuite() {
		Config = new ConfigReader();
		d=BrowserFactory.startChrome(Config.getBrowser(), d);
		BrowserFactory.startApplication(d, Config.getDataFromConfig("URL"));
		
	}
	
	@AfterSuite
	public void tearDown() {
		d.quit();
	}

}