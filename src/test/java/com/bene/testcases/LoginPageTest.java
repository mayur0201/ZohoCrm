package com.bene.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bene.base.TestBase;

import com.bene.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage lg;
	
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void Setup()
	{
		
		
		 lg = new LoginPage();
	}
	
	@Test
	
	public void login()
	{
		lg.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
}
