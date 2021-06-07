package com.sgtesting.pageobjectmod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages {

	public ActiTimePages(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName text field
	private WebElement username;

	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password Text Field
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;

	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}

	//Create WebElement for FlyOutWindow 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
   //Create WebElement for CreateUser text field
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")

	private WebElement createUser;

	public WebElement getCreateUser()
	{
		return createUser;
	}

	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")

	private WebElement addUser;

	public WebElement getAddUser()
	{
		return addUser;
	}
    private WebElement firstName;

	public WebElement getFirstName()
	{
		return firstName;
	}

	private WebElement lastName;

	public WebElement getLastName()
	{
		return lastName;
	}

	private WebElement email;

	public WebElement getEmail()
	{
		return email;
	}

	@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
	private WebElement usern ;
	public WebElement getUserNa()
	{
		return usern;
	}

	private WebElement password ;
	public WebElement getPassd()
	{
		return password;
	}

	private WebElement passwordCopy ;
	public WebElement getPasswordC()
	{
		return passwordCopy;
	}

	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement commit ;
	public WebElement commit()
	{
		return commit;
	}

	//Create WebElement for deleteUser text field
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement delete ;
	public WebElement delete1()
	{
		return delete;
	}

	private WebElement userDataLightBox_deleteBtn;
	public WebElement deletebtn()
	{
		return userDataLightBox_deleteBtn;
	}

	//Create WebElement for modifyUser text field

	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")

	private WebElement modifyUser;

	public WebElement getModifyUser()
	{
		return modifyUser;
	}
   @FindBy(xpath="//*[@id='userDataLightBox_usernameField']")

	private WebElement modifyUser1;

	public WebElement getModifyUser1()
	{
		return modifyUser1;
	}

	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")

	private WebElement modifyUser2;

	public WebElement getModifyUser2()
	{
		return modifyUser2;
	}

	//Create WebElement for createCustomer text field

	@FindBy(xpath="//*[@id='topnav']/tbody/tr/td[3]/a")

	private WebElement createCustomer;

	public WebElement getCreateCustomer()
	{
		return createCustomer;
	}

	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")

	private WebElement addCustomer;

	public WebElement getAddCustomer()
	{
		return addCustomer;
	}

	@FindBy(xpath="/html/body/div[14]/div[1]")

	private WebElement selCustomer;

	public WebElement getSelCustomer()
	{
		return selCustomer;
	}

	private WebElement customerLightBox_nameField;
	public WebElement getCusName()
	{
		return customerLightBox_nameField;
	}

	private WebElement customerLightBox_descriptionField;
	public WebElement getDesName()
	{
		return customerLightBox_descriptionField;
	}

	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div/span")
	private WebElement commitbtn ;
	public WebElement getCommitBtn()
	{
		return commitbtn;
	}

	//Create WebElement for deleteCustomer text field

	@FindBy(xpath="//*[@id='topnav']/tbody/tr/td[3]/a")

	private WebElement deleteCustomer;

	public WebElement getDeleteCustomer()
	{
		return deleteCustomer;
	}

   @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")

	private WebElement deleteCustomer1;

	public WebElement getDeleteCustomer1()
	{
		return deleteCustomer1;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")

	private WebElement deleteCustomer2;

	public WebElement getDeleteCustomer2()
	{
		return deleteCustomer2;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")

	private WebElement deleteCustomer3;

	public WebElement getDeleteCustomer3()
	{
		return deleteCustomer3;
	}

	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getDelCusName()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}

	//Create WebElement for modifyCustomer text field

	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")

	private WebElement modifyCustomer;

	public WebElement getModifyCustomer()
	{
		return modifyCustomer;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")

	private WebElement modifyCustomer1;

	public WebElement getModifyCustomer1()
	{
		return modifyCustomer1;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")

	private WebElement modifyCustomer2;

	public WebElement getModifyCustomer2()
	{
		return modifyCustomer2;
	}

	//Create WebElement for createProject text field

	@FindBy(xpath="//*[@id='topnav']/tbody/tr/td[3]/a")

	private WebElement createProject;

	public WebElement getCreateProject()
	{
		return createProject;
	}

	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")

	private WebElement createProject1;

	public WebElement getCreateProject1()
	{
		return createProject1;
	}

	@FindBy(xpath="/html/body/div[14]/div[2]")

	private WebElement createProject2;

	public WebElement getCreateProject2()
	{
		return createProject2;
	}

	private WebElement projectPopup_projectNameField;

	public WebElement getCreateProject3()
	{
		return projectPopup_projectNameField;
	}

	@FindBy(xpath="//*[@id='ext-gen50']/td[2]/em")

	private WebElement createProject4;

	public WebElement getCreateProject4()
	{
		return createProject4;
	}


	@FindBy(xpath="//*[@id='ext-gen125']")

	private WebElement createProject5;

	public WebElement getCreateProject5()
	{
		return createProject5;
	}


	private WebElement projectDescriptionField;

	public WebElement getCreateProject6()
	{
		return projectDescriptionField;
	}

	@FindBy(xpath="//*[@id='projectPopup_commitBtn']/div/span")

	private WebElement createProject7;

	public WebElement getCreateProject7()
	{
		return createProject7;
	}


	//Create WebElement for deleteProject text field

	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")

	private WebElement deleteProject;

	public WebElement getDeleteProject()
	{
		return deleteProject;
	}

	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")

	private WebElement deleteProject1;

	public WebElement getDeleteProject1()
	{
		return deleteProject1;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")

	private WebElement deleteProject2;

	public WebElement getDeleteProject2()
	{
		return deleteProject2;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")

	private WebElement deleteProject3;

	public WebElement getDeleteProject3()
	{
		return deleteProject3;
	}

	private WebElement projectPanel_deleteConfirm_submitBtn;

	public WebElement getDeleteProject4()
	{
		return projectPanel_deleteConfirm_submitBtn;
	}

	//Create WebElement for modifyProject text field
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")

	private WebElement modifyProject;

	public WebElement getModifyProject()
	{
		return modifyProject;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyProject1;

	public WebElement getModifyProject1()
	{
		return modifyProject1;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement modifyProject2;

	public WebElement getModifyProject2()
	{
		return modifyProject2;
	}


	//Create WebElement for createTasks text field
	@FindBy(xpath="//*[@id='topnav']/tbody/tr/td[3]/a")

	private WebElement createTasks;

	public WebElement getCreateTasks()
	{
		return createTasks;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")

	private WebElement createTasks1;

	public WebElement getCreateTasks1()
	{
		return createTasks1;
	}

	@FindBy(xpath="/html/body/div[13]/div[1]")

	private WebElement createTasks2;

	public WebElement getCreateTasks2()
	{
		return createTasks2;
	}

	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")

	private WebElement createTasks3;

	public WebElement getCreateTasks3()
	{
		return createTasks3;
	}

	private WebElement createTasksPopup_commitBtn;

	public WebElement getCreateTasks4()
	{
		return createTasksPopup_commitBtn;
	}

	//Create WebElement for deleteTasks text field

	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")

	private WebElement deleteTasks;

	public WebElement getDeleteTasks()
	{
		return deleteTasks;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")

	private WebElement deleteTasks1;

	public WebElement getDeleteTasks1()
	{
		return deleteTasks1;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")

	private WebElement deleteTasks2;

	public WebElement getDeleteTasks2()
	{
		return deleteTasks2;
	}

	@FindBy(xpath="//*[@id='taskPanel_deleteConfirm_submitTitle']")

	private WebElement deleteTasks3;

	public WebElement getDeleteTasks3()
	{
		return deleteTasks3;
	}

	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;
	}
	//Create webElement for create3user name field
	//create user1
		@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")

		private WebElement createUser1;

		public WebElement getCreateUser1()
		{
			return createUser1;
		}

		@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")

		private WebElement addUser1;

		public WebElement getAddUser1()
		{
			return addUser1;
		}
		private WebElement firstName1;

		public WebElement getfirstName1()
		{
			return firstName;
		}

		private WebElement lastName1;

		public WebElement getlastName1()
		{
			return lastName;
		}

		private WebElement email1;

		public WebElement getemail1()
		{
			return email;
		}

		@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
		private WebElement usern1 ;
		public WebElement getUserNa1()
		{
			return usern;
		}

		private WebElement password1 ;
		public WebElement getPassd1()
		{
			return password;
		}

		private WebElement passwordCopy1;
		public WebElement getPasswordC1()
		{
			return passwordCopy;
		}

		@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
		private WebElement commit1 ;
		public WebElement commit1()
		{
			return commit;
		}
		//create user2
		@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")

		private WebElement createUser2;

		public WebElement getCreateUser2()
		{
			return createUser2;
		}

		@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")

		private WebElement addUser2;

		public WebElement getAddUser2()
		{
			return addUser2;
		}
		private WebElement firstName2;

		public WebElement getFirstName2()
		{
			return firstName;
		}

		private WebElement lastName2;

		public WebElement getLastName2()
		{
			return lastName;
		}

		private WebElement email2;

		public WebElement getEmail2()
		{
			return email;
		}

		@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
		private WebElement usern2 ;
		public WebElement getUserNa2()
		{
			return usern;
		}

		private WebElement password2 ;
		public WebElement getPassd2()
		{
			return password;
		}

		private WebElement passwordCopy2 ;
		public WebElement getPasswordC2()
		{
			return passwordCopy;
		}

		@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
		private WebElement commit2 ;
		public WebElement commit2()
		{
			return commit;
		}
		//create user3
		@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")

		private WebElement createUser3;

		public WebElement getCreateUser3()
		{
			return createUser3;
		}

		@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")

		private WebElement addUser3;

		public WebElement getAddUser3()
		{
			return addUser3;
		}
		private WebElement firstName3;

		public WebElement getFirstName3()
		{
			return firstName;
		}

		private WebElement lastName3;

		public WebElement getLastName3()
		{
			return lastName;
		}

		private WebElement email3;

		public WebElement getEmail3()
		{
			return email;
		}

		@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
		private WebElement usern3 ;
		public WebElement getUserNa3()
		{
			return usern;
		}

		private WebElement password3 ;
		public WebElement getPassd3()
		{
			return password;
		}

		private WebElement passwordCopy3 ;
		public WebElement getPasswordC3()
		{
			return passwordCopy;
		}

		@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
		private WebElement commit3;
		public WebElement commit3()
		{
			return commit;
		}
    // loginandlogoutuser1
		private WebElement username1;
		public WebElement getusername()
		{
			return username;
		}
		private WebElement pwd1;
		public WebElement getpassword()
		{
			return pwd;
		}
		@FindBy(xpath="//*[@id='loginButton']/div")
		private WebElement oBtnLogin1;
		public WebElement getdelete1()
		{
			return oBtnLogin1;
		}
		@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
		private WebElement oBtnLnk;
		public WebElement getdelete2()
		{
			return oBtnLnk;
		}
		@FindBy(xpath="//*[@id=\"logoutLink\"]")
		private WebElement oBtnLogout;
		public WebElement getdelete3()
		{
			return oBtnLogout;
		}
		// loginandlogoutuser2
				private WebElement username2;
				public WebElement getusername2()
				{
					return username;
				}
				private WebElement pwd2;
				public WebElement getpassword2()
				{
					return pwd;
				}
				@FindBy(xpath="//*[@id='loginButton']/div")
				private WebElement oBtnLogin2;
				public WebElement getdelete4()
				{
					return oBtnLogin1;
				}
				@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
				private WebElement oBtnLnk2;
				public WebElement getdelete5()
				{
					return oBtnLnk;
				}
				@FindBy(xpath="//*[@id=\"logoutLink\"]")
				private WebElement oBtnLogout2;
				public WebElement getdelete6()
				{
					return oBtnLogout;
				}
				// loginandlogoutuser3
				private WebElement username3;
				public WebElement getusername3()
				{
					return username;
				}
				private WebElement pwd3;
				public WebElement getpassword3()
				{
					return pwd;
				}
				@FindBy(xpath="//*[@id='loginButton']/div")
				private WebElement oBtnLogin3;
				public WebElement getdelete7()
				{
					return oBtnLogin1;
				}
				@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
				private WebElement oBtnLnk3;
				public WebElement getdelete8()
				{
					return oBtnLnk;
				}
				@FindBy(xpath="//*[@id=\"logoutLink\"]")
				private WebElement oBtnLogout1;
				public WebElement getdelete9()
				{
					return oBtnLogout;
				}
				//delete users 1
				@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")
				private WebElement deleteuser1;
				public WebElement getdeleteuser1()
				{
					return deleteuser1;
				}
				@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[2]")
				private WebElement deleteuser2;
				public WebElement getdeleteuser2()
				{
					return deleteuser2;
				}
				@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
				private WebElement deleteuser3;
				public WebElement getdeleteuser3()
				{
					return deleteuser3;
				}
				//delete user2
				@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[2]")
				private WebElement deleteuser4;
				public WebElement getdeleteuser4()
				{
					return deleteuser4;
				}
				@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
				private WebElement deleteuser5;
				public WebElement getdeleteuser5()
				{
					return deleteuser5;
				}
				//delete user3
				@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[2]")
				private WebElement deleteuser6;
				public WebElement getdeleteuser6()
				{
					return deleteuser6;
				}
				@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
				private WebElement deleteuser7;
				public WebElement getdeleteuser7()
				{
					return deleteuser7;
				}
		    
		 }

