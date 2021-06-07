package com.sgtesting.pageobjectmod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdavanceAssig1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		create3Users();
		logout();
		loginandlogoutuser1();
		loginandlogoutuser2();
		loginandlogoutuser3();
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
	static void create3Users()
	{	
         try
		{
			//create user1
		    oPage.getCreateUser1().click();
            Thread.sleep(1000);
			oPage.getAddUser1().click();
            Thread.sleep(1000);
			oPage.getfirstName1().sendKeys("user1");
			oPage.getlastName1().sendKeys("last1");
			oPage.getemail1().sendKeys("user1@mail.com");
			oPage.getUserNa1().sendKeys("user1");
			oPage.getPassd1().sendKeys("password1");
			oPage.getPasswordC1().sendKeys("password1");
            oPage.commit1().click();
			Thread.sleep(1500);
			//creating user 2
			oPage.getCreateUser2().click();
            Thread.sleep(1000);
			oPage.getAddUser2().click();
            Thread.sleep(1000);
			oPage.getFirstName2().sendKeys("user2");
			oPage.getLastName2().sendKeys("last2");
			oPage.getEmail2().sendKeys("user2@mail.com");
			oPage.getUserNa2().sendKeys("user2");
			oPage.getPassd2().sendKeys("password2");
			oPage.getPasswordC2().sendKeys("password2");
            oPage.commit2().click();
			Thread.sleep(1500);
			
			//creating user 3
			oPage.getCreateUser3().click();
            Thread.sleep(1000);
			oPage.getAddUser3().click();
            Thread.sleep(1000);
			oPage.getFirstName3().sendKeys("user3");
			oPage.getLastName3().sendKeys("last3");
			oPage.getEmail3().sendKeys("user3@mail.com");
			oPage.getUserNa3().sendKeys("user3");
			oPage.getPassd3().sendKeys("password3");
			oPage.getPasswordC3().sendKeys("password3");
            oPage.commit3().click();
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
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser1()
	{
		try
		{
			oPage.getusername().sendKeys("user1");		
            Thread.sleep(3000);
			oPage.getpassword().sendKeys("password1");	
            Thread.sleep(3000);
			oPage.getdelete1().click();	
            Thread.sleep(4000);
			oPage.getdelete2().click();  
            Thread.sleep(4000);
			oPage.getdelete3().click(); 	
            Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginandlogoutuser2()
	{
		try
		{
			oPage.getusername2().sendKeys("user2");
            Thread.sleep(1000);
			oPage.getpassword2().sendKeys("password2");
            Thread.sleep(1000);
			oPage.getdelete4().click();
            Thread.sleep(1500);
			oPage.getdelete5().click();
            Thread.sleep(2000);
			oPage.getdelete6().click(); 
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
			oPage.getusername3().sendKeys("user3");
            Thread.sleep(1000);
			oPage.getpassword3().sendKeys("password3");
            Thread.sleep(1000);
			oPage.getdelete7().click();
            Thread.sleep(1500);
			oPage.getdelete8().click();
            Thread.sleep(2000);
			oPage.getdelete9().click(); 
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

			oPage.getdeleteuser1().click();
            Thread.sleep(1000);
			oPage.getdeleteuser2().click(); 
			Thread.sleep(4500);
			oPage.getdeleteuser3().click();
            Thread.sleep(4500);
            Alert check=oBrowser.switchTo().alert();check.accept();	
            Thread.sleep(2000);
			oBrowser.navigate().refresh();
            Thread.sleep(2000);
            //delete user2
            oPage.getdeleteuser4().click(); 
			Thread.sleep(5000);
			oPage.getdeleteuser5().click();
            Thread.sleep(5000);
            Alert check1=oBrowser.switchTo().alert();check.accept();	
            Thread.sleep(2000);
			oBrowser.navigate().refresh();
            Thread.sleep(2000);
            //delete user3
            oPage.getdeleteuser6().click(); 
			Thread.sleep(5000);
			oPage.getdeleteuser7().click();
            Thread.sleep(0500);
            Alert check2=oBrowser.switchTo().alert();check.accept();	
            Thread.sleep(2000);
			oBrowser.navigate().refresh();
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


