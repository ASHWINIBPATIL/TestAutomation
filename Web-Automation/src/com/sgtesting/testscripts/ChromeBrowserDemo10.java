package com.sgtesting.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo10{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		create3Users();
		logout();
		loginandlogoutuser1();
		loginandlogoutuser2();
		loginandlogoutuser3();
		loginAdmin();   
		deleteUser();
		deleteUser();
		deleteUser();
		logout(); 
		closeapplication();

	}
	public static WebDriver getbrowser=null;
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkSpace\\Web-Automation\\Libarary\\Drivers\\chromedriver.exe");
			getbrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void navigate()
	{
		try
		{
			
			getbrowser.navigate().to("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAdmin()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("admin");
             Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd")); pwd.sendKeys("manager");
             Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")); login.click();
             Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			getbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void create3Users()
	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(1000);
			//creating user 1
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));add.click();
            Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));fname.sendKeys("user1");
			lname=getbrowser.findElement(By.name("lastName"));lname.sendKeys("last1");
			email=getbrowser.findElement(By.name("email"));	email.sendKeys("user1@mail.com");
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user1");
			pwd=getbrowser.findElement(By.name("password"));pwd.sendKeys("password1");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password1");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			//creating user 2
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();
            Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));fname.sendKeys("user2");
			lname=getbrowser.findElement(By.name("lastName"));lname.sendKeys("last2");
			email=getbrowser.findElement(By.name("email"));	email.sendKeys("user2@mail.com");
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user2");
			pwd=getbrowser.findElement(By.name("password"));pwd.sendKeys("password2");
			repwd=getbrowser.findElement(By.name("passwordCopy"));repwd.sendKeys("password2");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			//creating user 3
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();
            Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));fname.sendKeys("user3");
			lname=getbrowser.findElement(By.name("lastName"));lname.sendKeys("last3");
			email=getbrowser.findElement(By.name("email"));	email.sendKeys("user3@mail.com");
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user3");
			pwd=getbrowser.findElement(By.name("password"));pwd.sendKeys("password3");
			repwd=getbrowser.findElement(By.name("passwordCopy"));repwd.sendKeys("password3");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));logout.click();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser1()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user1");		
            Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));pwd.sendKeys("password1");	
            Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));	login.click();	
            Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  
            Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 	
            Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser2()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user2");
            Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));pwd.sendKeys("password2");
            Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));	login.click();
            Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
            Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 
            Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser3()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user3");
            Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));pwd.sendKeys("password3");	
            Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));login.click();
            Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
            Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 
            Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{	

			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
            Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();check.accept();	
            Thread.sleep(2000);
			getbrowser.navigate().refresh();
            Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeapplication()
	{
		try
		{
			getbrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

