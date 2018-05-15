package com.clavax.novus.admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.clavax.novus.login.Novusautomation;
import com.clavax.novus.utility.Baseclass;

@Listeners(com.clavax.novus.utility.TestListners.class)
public class Admin extends Novusautomation  {
	
	@Test(priority=2,dependsOnMethods ={"adminLogin"})
	public void verifyAdmindasboard(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String dashboard =driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(dashboard, "https://novusloyaltystaging.azurewebsites.net/Home/Dashboard");
	}
	@Test(priority=3,dependsOnMethods={"adminLogin","verifyAdmindasboard"})
	public void addRole(){
		//Navigate to role module
		driver.findElement(By.id("Role")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("sometjhing");
		driver.findElement(By.id("Role-Detail")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("sometjhing 222222222");
		driver.findElement(By.id("create")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("sometjhing 33333333");
		driver.findElement(By.id("RoleName")).sendKeys(roleName);
		System.out.println("sometjhing 444444444");
		Select dropdown = new Select(driver.findElement(By.id("RoleTypeId")));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dropdown.deselectByValue("1");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("sometjhing 5555555");
		WebElement rotatebutton =driver.findElement(By.className("widget-heading")).findElement(By.className("panel-title assign-prmsn-title"));
		System.out.println(rotatebutton);
		rotatebutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		

	

		
		
	}
	
	
	
	
	

}
