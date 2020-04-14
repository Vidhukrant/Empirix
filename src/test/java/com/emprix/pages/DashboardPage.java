package com.emprix.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
	
	WebDriver d;

	public DashboardPage(WebDriver ldriver) {

		this.d = ldriver; // Initialize the webdriver
	}
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	 WebElement dropDown;
	@FindBy(xpath="//*[text()='QA_traininguser25(Empirix_QA_Training)']")
	 WebElement dropDown1;
	@FindBy(xpath="//*[@style=' display:inline']")
	 WebElement english;
	@FindBy(xpath="//*[text()='Japanese']")
	 WebElement japaneese;
	@FindBy(xpath="(//*[text()='Dashboard'])[1]")
	 WebElement dashboard;
	@FindBy(xpath="(//*[text()='Alerts'])[1]")
	 WebElement Alert;
	@FindBy(xpath="(//*[text()='Tests'])[1]")
	 WebElement Test;
	@FindBy(xpath="(//*[text()='Variables'])[1]")
	 WebElement variables;
	@FindBy(xpath="(//*[text()='Notifications'])[1]")
	 WebElement notifications;
	@FindBy(xpath="(//*[text()='アラート'])[1]")
	 WebElement jAlert;
	@FindBy(xpath="(//*[text()='テスト'])[1]")
	 WebElement jTest;
	@FindBy(xpath="(//*[text()='変数'])[1]")
	 WebElement jVariables;
	@FindBy(xpath="(//*[text()='通知'])[1]")
	 WebElement jNotification;
	@FindBy(xpath="//span[text()='Client']")
	 WebElement client;
	@FindBy(xpath="//h3[@class='panel-title']")
	 WebElement cientInfo;
	public void changeLanguage() {
		
		//explicitWait(dashboard);
		waitFor(25);
		dropDown1.click();
		waitFor(4);
		japaneese.click();
		waitFor(4);
		d.switchTo().alert().accept();
		waitFor(10);
		dropDown1.click();
		waitFor(10);
		english.click();
		waitFor(3);
		d.switchTo().alert().accept();
	}
	
	public void switchingTabs() {
		//explicitWait(dashboard);
		waitFor(25);
		Alert.click();
		waitFor(5);
		Test.click();
		waitFor(5);
		variables.click();
		waitFor(5);
		notifications.click();
		waitFor(3);
		dashboard.click();
	}
	
	public void switchTabsJapaneese() {
		
		waitFor(25);
		dropDown1.click();
		waitFor(4);
		japaneese.click();
		waitFor(4);
		d.switchTo().alert().accept();
		waitFor(12);
		jAlert.click();
		waitFor(5);
		jTest.click();
		waitFor(5);
		jVariables.click();
		waitFor(5);
		jNotification.click();
	}
	public void verifyCientDetails() {
		waitFor(25);
		dropDown1.click();
		waitFor(4);
		client.click();
		waitFor(5);
		BasePage.isElementPresent(d, cientInfo);
		
	}

	

}
