package com.mbm.pages;

import org.openqa.selenium.By;

import com.mbm.enums.WaitStrategy;

public class OrangeHRMLoginPage extends BasePage{
	
	
	//private final By login = By.name("username");
	private final By textboxUsername = By.name("username");
	private final By textboxPassword = By.name("password");
	private final By loginButton = By.xpath("//button[normalize-space()='Login']");
	
	public OrangeHRMLoginPage enterUsername(String username) {
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE, "Username");
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE, "Password");
		return this;
	}
	
	public OrangeHRMHomePage clickSubmit() {
		clickButton(loginButton,  WaitStrategy.CLICKABLE, "Login Button");
		return new OrangeHRMHomePage();
	}
	
	
}
