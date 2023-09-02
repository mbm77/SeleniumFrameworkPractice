package com.mbm.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	
	private ExtentManager() {
		
	}
	
	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();
	
	public static ExtentTest getExtentTest() {
		return extTest.get();
	}
	
	public static void setExtentTest(ExtentTest extentTest) {
		extTest.set(extentTest);
	}
	
	public static void unload() {
		extTest.remove();
	}
}
