package com.framework.CRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public Properties pro;
	public FileInputStream input;
	public EventFiringWebDriver edriver;
	public WebDriverListner wdriver;

	public TestBase() {
		pro = new Properties();
		try {
			pro.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"framework"+File.separator+"CRM"+File.separator+"properties"+File.separator+"config.properties")));
		} catch (FileNotFoundException e) {
			log.debug(e.getMessage());
		} catch (IOException e) {
			log.info(e.getMessage());

		}

	}
	
	public void intialization()
	{
		
		
		if(pro.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"res"+File.separator+"chromedriver.exe");
			driver = new ChromeDriver();
			log.info("chrome driver successfully lanched ");
		}
		
		
		
		edriver = new EventFiringWebDriver(driver);
		wdriver = new WebDriverListner();
		edriver.register(wdriver);
		driver = edriver;
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(pro.getProperty("testsiteurl"));
		log.info("Browser url is lanched "+pro.getProperty("testsiteurl"));
		
	}

	
		

	
}
