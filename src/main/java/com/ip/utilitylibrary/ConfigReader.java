package com.ip.utilitylibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import com.ip.utilitylibrary.*;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConfigReader {
	
	File file;
	FileInputStream fis;
	Properties property;
	Base base;
	
	public ConfigReader()
	{
		file = new File("src\\main\\resources\\config\\config.property");
		try {
			fis = new FileInputStream(file);
			property = new Properties();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String GetUrl()
	{
		String url = property.getProperty("ApplicationUrl");
		return url;
	}
	
	public String GetFirefoxDriverPath()
	{
		String geckodriverpath = property.getProperty("GeckoDriver");
		return geckodriverpath;
	}
	
	public String GetChromeDriverPath()
	{
		String chromedriverpath = property.getProperty("ChromeDriver");
		return chromedriverpath;
	}
	
	public String GetInternetExplorerDriverPath()
	{
		String iedriverpath = property.getProperty("IEDriver");
		return iedriverpath;
	}
	
	public String GetBrowserName()
	{
		Capabilities capabilities = ((RemoteWebDriver)base.Driver).getCapabilities();
		return capabilities.getBrowserName();
	}
	
	public String GetConfigFilePath()
	{
		String configfilepath = property.getProperty("ExcelTestData");
		return configfilepath;
	}

}
