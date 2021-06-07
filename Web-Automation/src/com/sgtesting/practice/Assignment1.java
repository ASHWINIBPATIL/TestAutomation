package com.sgtesting.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment1 {
		public static WebDriver oBrowser=null;
		@Test(priority=1)
		public void LaunchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","E:\\DemoWorkspace\\Web-Automation\\Libarary\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=2)
		public void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=3,dataProvider="getLoginCredentials")
		public void login(String username,String password)
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
				oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys(password);
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=4)
		public void CreateUser() {
			try {
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("demo");
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("user");
				oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("demo@gmail.com");
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("user1");
				oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("welcome");
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("welcome");
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=5)
		public void DeleteUser() {
			try {
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@class='groupName']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@class='deleteContainer']")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=6)
		public void logout() {
			try {
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=7)
		public void closeApplication()
		{
			try
			{

				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		@DataProvider
		public Object[][] getLoginCredentials()
		{
			return new Object[][]  {{"admin","manager"}};
		}

	}



