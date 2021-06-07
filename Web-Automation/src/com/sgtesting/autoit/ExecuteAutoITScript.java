package com.sgtesting.autoit;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("E:/AutoIt/DemoTestScript1.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

