package com.emprix.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emprix.pages.DashboardPage;
import com.emprix.pages.LoginPage;

public class DashboardTest extends BaseTest {
	
	
	DashboardPage dashboard;
	LoginPage loginPage;
	
	@BeforeMethod
	public void background() {
		dashboard= PageFactory.initElements(d, DashboardPage.class);
		loginPage=PageFactory.initElements(d, LoginPage.class);
		loginPage.login(Config.getDataFromConfig("Username"), Config.getDataFromConfig("Password"));

		
	}
	@Test(description="Change the language from English to Japaneese and vice versa")
	public void TC_003() {
		
	 dashboard.changeLanguage();
		
	}
	@Test(description="Switch tabs which are available on dashboard in english language")
	public void TC_004() {
		
		dashboard.switchingTabs();
	}
	
	@Test(description="Switch tabs which are available on dashboard in Japaneese language")
	public void TC_005() {
		
		dashboard.switchTabsJapaneese();
	}
	@Test(description="Verify client details")
	public void TC_006()
	{
		dashboard.verifyCientDetails();
	}

}
