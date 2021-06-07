package com.sgtesting.pageobjectmod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser();
		deleteUser();
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

	static void createUser()
	{
		try
		{

			oPage.getCreateUser().click();
			Thread.sleep(2000);

			oPage.getAddUser().click();
			Thread.sleep(4000);

			oPage.getFirstName().sendKeys("demo1");
			oPage.getLastName().sendKeys("User");
			oPage.getEmail().sendKeys("demo@gmail.com");
			oPage.getUserNa().sendKeys("user11");
			oPage.getPassd().sendKeys("Welcome1");
			oPage.getPasswordC().sendKeys("Welcome1");

			oPage.commit().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{

			oPage.delete1().click();
			Thread.sleep(5000);

			oPage.deletebtn().click();
			Thread.sleep(5000);

			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

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

