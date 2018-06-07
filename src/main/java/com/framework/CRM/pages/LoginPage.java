package com.framework.CRM.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.CRM.TestBase;

public class LoginPage  extends TestBase{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	
	public String validateUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public HomePage login(String usr,String pwd)
	{
		username.sendKeys(usr);
		password.sendKeys(pwd);
		loginbtn.click();
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginbtn);*/
		
		return new HomePage();
	}
}
