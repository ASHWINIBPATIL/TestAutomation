package com.sgtesting.log4j;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Assignment8 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("For browser successful");
	@Test(priority=1)
	static void launchBrowser()
	{
		try
		{
			log.info("The browser launch successfully");
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\Libarary\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void navigate()
	{
		try
		{
			log.info("The browser navigate");
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void Adminlogin()
	{
		try
		{
			log.info("The login page open successfully ");
            log.info("The username and password provided"); 
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void minimizeFlyOutWindow()
	{
		try
		{
			log.info("The page minimize successfully");
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void User1()//*[@id="welcomeScreenBoxId"]/div[3]/div/span[1]
	{
		try
		{
			log.info("The user created successfully");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("User1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void User2()
	{
		try
		{
			log.info("The user2 created successfully");
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo2");
			oBrowser.findElement(By.name("email")).sendKeys("User2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("User2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void User3()
	{
		try
		{
			log.info("The user3 created successfully");
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo3");
			oBrowser.findElement(By.name("email")).sendKeys("User3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("User3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User3");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void logout()
	{
		try
		{
			log.info("The logout option performed");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void User1Loging()
	{
		try
		{
			log.info("The user1loging successfully");
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	static void User1logout()
	{
		try
		{
			log.info("The user1logout successfully");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	static void User2Loging()
	{
		try
		{
			log.info("The user2loging successfully");
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	static void User2Logout()
	{
		try
		{
			log.info("The user2logout successfully");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	static void User3Loging()
	{
		try
		{
			log.info("The user3loging successfully");
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("User3");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	static void User3Logout()
	{
		try
		{
			log.info("The user3logout successfully");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	static void Admin1login()
	{
		try
		{
			log.info("The adminlogin successfully");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	static void deleteUser1()
	{
		try
		{
			log.info("The deleteuser1 successfully");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
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
	@Test(priority=17)
	static void deleteUser2()
	{
		try
		{
			log.info("The deleteuser2 successfully");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
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
	@Test(priority=18)
	static void deleteUser3()
	{
		try
		{
			log.info("The deleteuser3 successfully");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
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
	@Test(priority=19)
	static void Adminlogout()
	{
		try
		{
			log.info("The adminlogout successfully");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=20)
	static void closeApplication()
	{
		try
		{
			log.info("The application close successfully");
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}


