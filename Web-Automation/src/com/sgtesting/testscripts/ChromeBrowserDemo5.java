package com.sgtesting.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo5 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {  //modifyproject
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		createProject();
		modifyProject();
		deleteProject();
		logout();
		closeApplication();
		
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\libarary\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField']")).sendKeys("Ashwini");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("	//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("Demoproject");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyProject()
	{
		try
		{

			oBrowser.findElement(By.xpath( "//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath( "//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("new project");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{

			oBrowser.findElement(By.xpath( "//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath( "//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitBtn']/div")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']/div")).click();
			Thread.sleep(4000);
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


