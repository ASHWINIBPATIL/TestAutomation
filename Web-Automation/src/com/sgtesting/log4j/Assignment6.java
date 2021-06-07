package com.sgtesting.log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Assignment6 {
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
			log.info("The browser navigate");
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
			log.info("The login page open successfully ");
            log.info("The username and password provided"); 
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys(password);
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(4000);
			log.info("The login page closed");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void createCustomer()
	{
		try
		{
			log.info("The customer created successfully");
			oBrowser.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Customer");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//textarea[@id='customerLightBox_descriptionField']")).sendKeys("Description about customer");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
			log.info("The customer page closed successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void CreateProject()
	{
		try
		{
			log.info("The project created successfully ");
			oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("Project1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@id='projectPopup_projectDescriptionField']")).sendKeys("Project1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@id='projectPopup_commitBtn']")).click();
			Thread.sleep(3000);
			log.info("The createproject page closed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void  modifyProject()
	{
		try
		{
			log.info("The modifyproject successfully");
			oBrowser.findElement(By.xpath("//div[contains(text(),'Project1')]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("modified project");
			Thread.sleep(1000);
			log.info("The project modify page closed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
static void DeleteProject()
	{
	try
		{
		    log.info("The project delete page is open");
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
			log.info("The project delete page is closed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void  DeleteCustomer()
	{
		try
		{
			log.info("The delete customer page is open");
			oBrowser.findElement(By.xpath("//div[@class='icon']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[@class='actionButton']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
			log.info("The customer deleted successfully");
		}
		catch(Exception e)
		{

		}
	}
	@Test(priority=9)
	static void  logout()
	{
		try
		{
			log.info("The logout option performed");
			oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	static void closeApplication()
	{
		try
		{
			log.info("The application closed successfully");
			Thread.sleep(1000);
			oBrowser.close();
		}
		catch(Exception e)
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

