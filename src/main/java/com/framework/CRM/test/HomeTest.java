package com.framework.CRM.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.CRM.TestBase;
import com.framework.CRM.pages.CalendarPage;
import com.framework.CRM.pages.CompaniesPage;
import com.framework.CRM.pages.ContactsPage;
import com.framework.CRM.pages.HomePage;
import com.framework.CRM.pages.LoginPage;

public class HomeTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	CalendarPage calendarPage;
	CompaniesPage companiesPage;
	ContactsPage contactsPage;
	
	public HomeTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
	 loginpage = new LoginPage();
	 calendarPage = new CalendarPage();
	 companiesPage = new CompaniesPage();
	 contactsPage = new ContactsPage();
	 homepage = loginpage.login("duddukhan", "duddukhan09");
	}
	
	@Test(priority=1)
	public void checkUserProfile()
	{
		Assert.assertTrue(homepage.isProfileNameDisplayed(), "Unable to display userprofileName ");
	}
	
	
	@Test(priority=2)
	public void clickOnCalender()
	{
		calendarPage= homepage.calenderBtn();
	}
	
	@Test(priority=3)
	public void clickonCompanies()
	{
		companiesPage = homepage.companiesBtn();
		homepage.isCompaniesPageDisplayed();
	}
	
	@Test(priority=4)
	public void clickOnContact()
	{
		contactsPage = homepage.contactBtn();
		homepage.isContactPageDisplayed();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
