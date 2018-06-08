package com.framework.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.CRM.TestBase;
import com.framework.CRM.utilites.TestUtilies;

public class HomePage extends  TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	//homepage
	@FindBy(xpath="//td[contains(text(),'User')]")
	WebElement profileName;
	
	@FindBy(xpath="//a[@title='Home']")
	WebElement homemenu;
	
	@FindBy(css="a[title='Calendar']")
	WebElement calendar;
	
	@FindBy(css="a[title='Companies']")
	WebElement companies;
	
	@FindBy(css="a[title='Contacts']")
	WebElement contacts;
	
	@FindBy(css="a[title='Deals']")
	WebElement deals;
	
	@FindBy(css="a[title='Tasks']")
	WebElement tasks;
	
	@FindBy(css="a[title='Cases']")
	WebElement cases;
	
	@FindBy(css="a[title='Call']")
	WebElement call;
	
	@FindBy(css="a[title='Email']")
	WebElement email;
	
	@FindBy(css="a[title='Text/SMS']")
	WebElement textsms;
	
	@FindBy(css="a[title='Print']")
	WebElement print;
	
	@FindBy(css="a[title='Campaigns']")
	WebElement campaigns;
	
	@FindBy(css="a[title='Docs']")
	WebElement docs;
	
	@FindBy(xpath="//td[contains(text(),'Companies')]")
	WebElement checkCompaniestitle;
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement checkContactsTitle;
	
	public boolean isProfileNameDisplayed()
	{
		TestUtilies.swithFrame();
		return profileName.isDisplayed();
	}
	
	public boolean isCompaniesPageDisplayed()
	{
		return  checkCompaniestitle.isDisplayed();
	}
	
	public boolean isContactPageDisplayed()
	{
		return checkContactsTitle.isDisplayed();
	}
	
	public HomePage homeBtn()
	{
		TestUtilies.swithFrame();
		homemenu.click();
		return new HomePage();

	}
	
	public CompaniesPage companiesBtn()
	{
		TestUtilies.swithFrame();
		companies.click();
		return new CompaniesPage();
	}
	
	public CalendarPage calenderBtn()
	{
		TestUtilies.swithFrame();
		calendar.click();
		return new CalendarPage();
	}
	
	public ContactsPage contactBtn()
	{
		TestUtilies.swithFrame();
		contacts.click();
		return new ContactsPage();
	}
}
