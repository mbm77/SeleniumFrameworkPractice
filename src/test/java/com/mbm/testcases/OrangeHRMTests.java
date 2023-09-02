package com.mbm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mbm.pages.OrangeHRMLoginPage;

public class OrangeHRMTests extends Base {

	private OrangeHRMTests() {

	}

	@Test
	public void loginTest() {
		String actualText = new OrangeHRMLoginPage()
			.enterUsername("Admin")
			.enterPassword("admin123")
			.clickSubmit()
			.verifyLogin();
		
		Assert.assertTrue(actualText.equalsIgnoreCase("dashboard"));
	}
	
	@Test
	public void logoutTest() {
		String actualText = new OrangeHRMLoginPage()
				.enterUsername("Admin")
				.enterPassword("admin123").clickSubmit()
				.clickUserDropDown().clickOnLogout().loginPage();
		
		Assert.assertTrue(actualText.equalsIgnoreCase("login"));
	}

}
