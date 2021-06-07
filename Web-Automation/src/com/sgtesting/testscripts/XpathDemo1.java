package com.sgtesting.testscripts;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		modifyUser();
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
		static void createuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'firstName')]")).sendKeys("Demo1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'lastName')]")).sendKeys("user1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'email')]")).sendKeys("demo@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'username')]")).sendKeys("Demouser1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'password')]")).sendKeys("welcome1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'passwordCopy')]")).sendKeys("welcome1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@*='buttonTitle']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void modifyUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='userNameSpan']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'password')]")).sendKeys("welcome111");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'passwordCopy')]")).sendKeys("welcome111");
			    Thread.sleep(2000);
			    oBrowser.findElement(By.xpath("//*[@*='buttonTitle']")).click();
			    Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		static void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='userNameSpan']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='deleteContainer']")).click();
				Thread.sleep(3000);
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
		
