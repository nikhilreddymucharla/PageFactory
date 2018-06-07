package com.framework.CRM.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.CRM.TestBase;
import com.framework.CRM.pages.HomePage;
import com.framework.CRM.pages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest()
	{
		super();
	}

	
	@BeforeMethod
	public void setup()
	{
		intialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateCurrenturl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), loginpage.validateUrl());
	}
	
	
	@Test(priority=2)
	public void userLoginTest()
	{
		homepage = loginpage.login("duddukhan","duddukhan09");
		
		
	}
	
	
	@AfterMethod
	public void Quit()
	{
		
		
			driver.quit();
		
	}
	
}
