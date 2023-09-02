package com.mbm.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mbm.constants.FrameworkConstants;

public class ExtentReport {
	private static ExtentReports extentReport;
	private ExtentReport() {
		
	}
	
	public static void initReport() {
		if(Objects.isNull(extentReport)) {
			extentReport = new ExtentReports();
			ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(
					FrameworkConstants.getExtentReportFilePath());
			extentSparkReporter.config().setDocumentTitle("Automation Report");
			extentSparkReporter.config().setTheme(Theme.DARK);
			extentSparkReporter.config().setReportName("Test Report");
			extentReport.attachReporter(extentSparkReporter);
		}
		
	}
	
	public static void flushReport() {
		if(Objects.nonNull(extentReport)) {
			extentReport.flush();
		}
		try {
			Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createTest(String testCaseName) {
		ExtentManager.setExtentTest(extentReport.createTest(testCaseName));
		
	}
	
	
}
