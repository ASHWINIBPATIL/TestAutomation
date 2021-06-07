package com.sgtesting.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo7 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		logout();
		login1();
		login1();
		login1();
		login();
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
	static void login1()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				String s3="user11"+i;
				String s4="Welcome1"+i;
				oBrowser.findElement(By.id("username")).sendKeys(s3);
				oBrowser.findElement(By.name("pwd")).sendKeys(s4);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
				Thread.sleep(6000);
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			for(int i=1;i<=3;i++)
			{
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(4000);
				String s="user"+i;
				String s1="demo"+i;
				String s2="demo@gmail"+i+".com";
				String s3="user11"+i;
				String s4="Welcome1"+i;
				String s5="Welcome1"+i;
				oBrowser.findElement(By.name("firstName")).sendKeys(s1);
				oBrowser.findElement(By.name("lastName")).sendKeys(s);
				oBrowser.findElement(By.name("email")).sendKeys(s2);
				oBrowser.findElement(By.name("username")).sendKeys(s3);
				oBrowser.findElement(By.name("password")).sendKeys(s4);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys(s5);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(5000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{
			String s[]= {"//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[4]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[3]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[2]/td[1]"};
			for(int i=0;i<=2;i++)
			{
				oBrowser.findElement(By.xpath(s[i])).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(5000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}
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

