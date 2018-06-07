package com.framework.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.CRM.TestBase;

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
	
	@FindBy(xpath="td[conatians]")
	WebElement conacts;
	
	public boolean isProfileNameDisplayed()
	{
		return profileName.isDisplayed();
	}
	
	public HomePage homePage()
	{
		return new HomePage();

	}
}
