package com.sgtesting.log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Assignment3 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("For browser successful");
	@Test(priority=1)
	static void LaunchBrowser()
	{
		try
		{
			log.info("The browser launch successfully");
			System.setProperty("webdriver.gecko.driver", "E:\\DemoWorkspace\\Web-Automation\\Libarary\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
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
			log.info("The navigate the browser");
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
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
			log.info("The login page is open successfully");
			log.info("The create username and password");
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("The login page closed successfully");
	}
	@Test(priority=4)
	static void CreateCustomer() {
		try 
		{
			log.info("The create customer page in open");
			oBrowser.findElement(By.xpath("//*[@class='content tasks']")).click();
			oBrowser.findElement(By.xpath("//*[@class='downIcon']")).click();
			Thread.sleep(1000);
			log.info("The create customer name successfully");
			oBrowser.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Customer1");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Customer discription");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(1000);
			log.info("The create customer page is closed");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void DeleteCustomer()
	{
		try 
		{
			log.info("The delete customer page in open");
			oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@class='action']")).click();
			oBrowser.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);		
			log.info("The customer page is delete successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=6)
	static void logout() {
		try {
			
			log.info("The page is logout successfully");
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void closeApplication()
	{
		
		try
		{
			Thread.sleep(1000);
			oBrowser.close();
			log.info("The application is close successfully");
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


