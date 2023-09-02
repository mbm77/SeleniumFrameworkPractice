package com.mbm.pages;

import org.openqa.selenium.By;

import com.mbm.enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage{

	private final By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");

	public String verifyLogin() {
		return getText(dashboard, WaitStrategy.PRESENCE);
		
	}
}
