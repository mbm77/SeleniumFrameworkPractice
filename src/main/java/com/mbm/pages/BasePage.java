package com.mbm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mbm.enums.WaitStrategy;
import com.mbm.factories.ExplicitWaitFactory;
import com.mbm.reports.ExtentLogger;

public class BasePage {
	
	protected void sendKeys(By by, String value, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitStrategy);
		element.sendKeys(value);
		ExtentLogger.pass(value +" is entered successfully in "+ elementname);
	}
	
	protected void clickButton(By by, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitStrategy);
		element.click();
		ExtentLogger.pass(elementname +" is clicked successfully");
	}
	
	protected String getText(By by, WaitStrategy waitStrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitStrategy);
		return element.getText();
		
	}
	
	protected void click(By by, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitStrategy);
		element.click();
		ExtentLogger.pass(elementname+  " is clicked successfully");
		
	}
}
