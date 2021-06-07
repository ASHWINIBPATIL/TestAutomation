package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment7 {
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	static void LaunchBrowser()
	{
		try
		{
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
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys(password);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void CreateCustomer() {
		try {
			oBrowser.findElement(By.xpath("//*[@class='content tasks']")).click();
			oBrowser.findElement(By.xpath("//*[@class='downIcon']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Customer1");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Customer discription");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void CreateProject() {
		try {
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@class='plusIcon']")).click();
			oBrowser.findElement(By.xpath("//*[@class='item createNewProject ellipsis']")).click();
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).click();
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("Project 1");		
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']")).click();		
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void createTask()
	{
		try
		{
		
			oBrowser.findElement(By.xpath("//div[@class='addNewTaskButtonContainer']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("task1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void deleteTask()
	{
		try
		{
		
			oBrowser.findElement(By.xpath("//div[@class='taskRowCellWrapper']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='taskPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void DeleteProject() {
		try {
			
			oBrowser.findElement(By.xpath("//div[@class='node projectNode selected']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void DeleteCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@class='action']")).click();
			oBrowser.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	static void logout() {
		try {
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	static void closeApplication()
	{
		try
		{
			Thread.sleep(1000);
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

