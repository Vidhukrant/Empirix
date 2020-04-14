package com.emprix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	public WebDriver d;

	 public void scrollBy(String scrollByPx) {
	        JavascriptExecutor js = (JavascriptExecutor) d;
	        js.executeScript("window.scrollBy(0," + scrollByPx + ")");
	    }

	    public void waitForVisible(By locator) {
	        new WebDriverWait(d,30).until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
	    
	    public static void waitFor(int seconds) {
	        try {
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	    
	    public void explicitWait(WebElement locator) {
	        new WebDriverWait(d, 90).until(ExpectedConditions.elementToBeClickable(locator));
	    }
	    
	    public void waitForLoader() {
	        try {
				waitShortForVisible(By.cssSelector("#wrapper"));
			} catch (Exception e) {
				e.printStackTrace();
			}
	        //waitForVisible(By.xpath("//div[@class='c-loader ng-star-inserted']"));
	        waitFor(5);
	    }
	    
	    public void waitShortForVisible(By locator) {
	        new WebDriverWait(d, 30).until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
	    
	    public static Boolean isElementPresent(WebDriver driver,WebElement element)
		{Boolean flag;
			try {
				flag=element.isDisplayed();
				Assert.assertTrue(true);
			}
			catch (Exception e) {
			 System.out.println("Button not displayed");
			 flag=false;
			 Assert.assertTrue(false, "Information is not displaying");
			}
			
			return flag;
			
		}

	
}
