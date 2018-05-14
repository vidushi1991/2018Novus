package com.clavax.novus.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.clavax.novus.utility.Baseclass;

@Listeners(com.clavax.novus.utility.TestListners.class)
public class Novusautomation extends Baseclass{
	
  @Test(priority=1)
  public static void adminLogin() {
	  
	 
		driver.findElement(By.id("LoginId")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
		  
		  //This is implicit  wait to for written time period
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  //This is explicit wait to wait till said time and till expected condition not visible
		  //WebDriverWait wait = new WebDriverWait(driver, 30);
		 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailId")));
		  driver.findElement(By.id("emailId")).sendKeys("novus@cladev.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		  driver.findElement(By.id("passwordId")).sendKeys("Cla@1234");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(By.id("signId")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		  String adminPageTitle =driver.getTitle();
		  System.out.println(adminPageTitle);
		  Assert.assertEquals(driver.getTitle(), "Novus");
	
  }
  
 
  
}
