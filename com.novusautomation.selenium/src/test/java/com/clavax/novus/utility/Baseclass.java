package com.clavax.novus.utility;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	
	public static WebDriver driver;
	static String testURL ="https://novusloyaltystaging.azurewebsites.net/Home/Index";
	
	@BeforeClass
	public static void startApp()
	{
		
			System.setProperty("webdriver.chrome.driver", "E:\\2018\\Selenium\\workspace\\com.novusautomation.selenium\\drivers\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("start-maximized");
			options.addArguments("--enable-automation");
			options.addArguments("test-type=browser");
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			//driver.manage().window().maximize();
			driver.get(testURL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("the title is "+driver.getTitle());

		
	}
	
	@AfterClass
	public void closeApp()
	{
	System.out.println("close browser");
	 driver.close();
	 
	 
	 
	 
	 driver.quit();
	 System.out.println("driver is closed");
	} 
	
	}