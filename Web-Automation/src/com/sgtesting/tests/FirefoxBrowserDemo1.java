package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		

	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "E:\\DemoWorkspace\\Web-Automation\\Libarary\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
