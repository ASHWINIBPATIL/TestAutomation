package com.sgtesting.pageobjectmod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) { //create and delete customer
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\Libarary\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiTimePages(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void flyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.getCreateCustomer().click();
			Thread.sleep(3000);
			oPage.getAddCustomer().click();
			Thread.sleep(2000);
			oPage.getSelCustomer().click();
			Thread.sleep(3000);
			oPage. getCusName().sendKeys("Democustomer");
			Thread.sleep(3000);
		    oPage.getDesName().click();
			Thread.sleep(3000);
			oPage.getCommitBtn().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			oPage. getDeleteCustomer().click();
			Thread.sleep(4000);
			oPage.getDeleteCustomer1().click();
			Thread.sleep(4000);
			oPage.getDeleteCustomer2().click();
			Thread.sleep(4000);
			oPage.getDeleteCustomer3().click();
			Thread.sleep(4000);
			oPage.getDelCusName().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	

