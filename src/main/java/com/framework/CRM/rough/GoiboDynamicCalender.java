package com.framework.CRM.rough;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.CRM.TestBase;

public class GoiboDynamicCalender extends TestBase {
	
	
	public GoiboDynamicCalender() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
	}
	
	
	public void checkMothIsPresentOrNot(String xpath,String path)
	{
		while(true)
		{
		try{
			
			driver.findElement(By.xpath(xpath)).isDisplayed();
			driver.findElement(By.xpath(path)).click();
			break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		}
	}

	

		

	
		
		
		@Test
		public void selectMonth()
		{
			String date = "12/19/2018";

			Date d = new Date(date);

			SimpleDateFormat dt = new SimpleDateFormat("MMMM/dd/yyyy");
			String finalmnt = dt.format(d);
			
			SimpleDateFormat formatedate = new SimpleDateFormat("E MMM dd yyyy");
			String finaldate = formatedate.format(d);

			String[] splitarray = finalmnt.split("/");
			
			String finalMonthXpath = "//*[contains(text(),'"+splitarray[0]+" "+splitarray[2]+"')]";
			
			String finalDateXpath = "//div[@aria-label='"+finaldate+"']";
			
			driver.findElement(By.xpath("//input[@id='gi_oneway_label']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Depart:')]//..//input[@class='form-control inputTxtLarge widgetCalenderTxt']")).click();
			checkMothIsPresentOrNot(finalMonthXpath,finalDateXpath);
			
			
		}
		
	
}
