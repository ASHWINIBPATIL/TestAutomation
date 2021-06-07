package com.sgtesting.testscripts;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		//logout();
		//closeApplication();

	}	
        static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\Libarary\\drivers\\chromedriver.exe");
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
				oBrowser.findElement(By.xpath("//input[starts-with(@name,'username')]")).sendKeys("admin");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name,'pwd')]")).sendKeys("manager");
				Thread.sleep(2000);
                oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
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
				oBrowser.findElement(By.xpath("//*[@*='gettingStartedShortcutsMenuCloseId']")).click();
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
				oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//div[text()= 'Add New']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@*='item createNewCustomer ellipsis']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='customerLightBox_nameField']")).sendKeys("DemoCustomer");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='customerLightBox_commitBtn']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='editButton available']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@*='action']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@*='title']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@*='buttonTitle']")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logout()
		{
			try
			{
				oBrowser.findElement(By.xpath("Logout")).click();
				Thread.sleep(3000);
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
		
