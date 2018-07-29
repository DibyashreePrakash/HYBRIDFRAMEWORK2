package com.ip.utilitylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Base {
	
	public  WebDriver Driver;
    DesiredCapabilities capability;
    String currentDir = System.getProperty("user.dir");
	@Test
	public void Initiate(String browsername)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Assets/geckodriver.exe");
			Driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Assets/chromedriver.exe");
			Driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			capability = new DesiredCapabilities();
			capability.setCapability("EnableNativeEvents", false);
            capability.setCapability("ignoreZoomSetting", true);
			System.setProperty("webdriver.ie.driver","./Assets/IEDriverServer.exe");
			Driver = new InternetExplorerDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./Assets/MicrosoftWebDriver.exe");
			Driver = new EdgeDriver();
		}
	}

}
