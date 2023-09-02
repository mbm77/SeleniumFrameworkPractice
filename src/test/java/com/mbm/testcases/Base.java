package com.mbm.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mbm.driver.Driver;
import com.mbm.enums.ConfigProperties;
import com.mbm.utils.ReadPropertyFile;

public class Base {
	@BeforeMethod
	public void setUp() {
		Driver.initDriver(ReadPropertyFile.getValue(ConfigProperties.BROWSER));
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

}
