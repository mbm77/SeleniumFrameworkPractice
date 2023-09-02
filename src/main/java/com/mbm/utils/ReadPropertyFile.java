package com.mbm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.mbm.enums.ConfigProperties;

public class ReadPropertyFile {
	
	private ReadPropertyFile() {
		
	}
	
	private static Properties pro;
	
	static {
		
		File configFile = new File(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(configFile);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static String getValue(ConfigProperties key) {
		if(Objects.isNull(pro.getProperty(key.name().toLowerCase()))) {
			throw new RuntimeException("propety name "+key+" is not found. Please check config.properties");
		}
		return pro.getProperty(key.name().toLowerCase());
	}

}
