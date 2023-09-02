package com.mbm.constants;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.mbm.enums.ConfigProperties;
import com.mbm.utils.ReadPropertyFile;

public class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCEPATH + "/executables/chromedriver.exe";
	private static final String GECKODRIVERPATH = RESOURCEPATH + "/executables/geckodriver.exe";
	private static final int EXPLICITWAIT = 10;
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir") + "/extent-test-output";
	private static String date = new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss").format(new Date());

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getGeckoDriverPath() {
		return GECKODRIVERPATH;
	}

	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}

	public static String getExtentReportFolderPath() {
		return EXTENTREPORTFOLDERPATH;
	}

	public static String getExtentReportFilePath() {
		if(ReadPropertyFile.getValue(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH+"/"+date+".index.html";
		}
		else {
			return EXTENTREPORTFOLDERPATH+"/index.html";
		}
		
	}

}
