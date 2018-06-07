package com.framework.CRM.utilites;

import java.io.File;
import java.io.IOException;
import java.sql.Time;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.framework.CRM.TestBase;

public class TestUtilies extends TestBase {
	
	public static void captureScreenShot() throws IOException
	{
	File orginalpath =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(orginalpath, new File(System.getProperty("user.dir")+File.separator+"Screeshort"+File.separator+System.currentTimeMillis()+".png"));
	}
	
	

}
