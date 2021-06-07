package com.sgtesting.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo8 {
	public static ChromeDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginCreate();
		loginModify();
		deleteUser();
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

	static void loginCreate()
	{
		try
		{
			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};
			for(int i=0;i<3;i++)
			{
				oBrowser.findElement(By.id("username")).sendKeys(s[i]);
				oBrowser.findElement(By.name("pwd")).sendKeys(a[i]);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				if(i>0)
				{

					oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
					Thread.sleep(6000);
				}
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.name("firstName")).sendKeys("user"+i);
				oBrowser.findElement(By.name("lastName")).sendKeys("demo"+i);
				oBrowser.findElement(By.name("email")).sendKeys("demo"+i+"@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys(s[i+1]);
				oBrowser.findElement(By.name("password")).sendKeys(a[i+1]);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys(a[i+1]);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);

			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginModify()
	{
		try
		{

			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};

			String b[]= {"//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[4]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[3]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[2]/td[1]"};
			for(int i=0;i<3;i++)
			{
				oBrowser.findElement(By.id("username")).sendKeys(s[i]);
				oBrowser.findElement(By.name("pwd")).sendKeys(a[i]);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				if(i>0)
				{

					oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
					Thread.sleep(6000);
				}
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath(b[i])).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.name("username")).sendKeys("new"+i);
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath( "//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
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

			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};
			String b[]= {"//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[4]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[3]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[2]/td[1]"};
			for(int i=0;i<=2;i++)
			{
				oBrowser.findElement(By.id("username")).sendKeys(s[i]);
				oBrowser.findElement(By.name("pwd")).sendKeys(a[i]);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				if(i>0)
				{

					oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
					Thread.sleep(6000);
				}
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath(b[i])).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(5000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Logout")).click();
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

