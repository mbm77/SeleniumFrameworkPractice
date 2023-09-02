package com.mbm.pages;

import org.openqa.selenium.By;

import com.mbm.enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage {

	private final By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
	private final By userDropDown = By.xpath("//span[@class='oxd-userdropdown-tab']");
	private final By logout = By.xpath("//a[normalize-space()='Logout']");
	
	public String verifyLogin() {
		return getText(dashboard, WaitStrategy.PRESENCE);

	}
	public OrangeHRMHomePage clickUserDropDown() {
		click(userDropDown, WaitStrategy.CLICKABLE, "UserDropDown");
		return this;
	}
	
	public OrangeHRMLoginPage clickOnLogout() {
		click(logout, WaitStrategy.CLICKABLE, "Logout");
		return new OrangeHRMLoginPage();
	}
}
