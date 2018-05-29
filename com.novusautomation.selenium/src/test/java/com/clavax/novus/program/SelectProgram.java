package com.clavax.novus.program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestNGException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*import com.clavax.novus.utility.Baseclass;

@Listeners(com.clavax.novus.utility.TestListners.class)
public class SelectProgram extends Baseclass {
	
	
	@Test(priority=2,dependsOnMethods ={"adminLogin"})
	 public static void chooseYourProgram() {
		
	
		  
		 try {
		
				Select programDropdown = new Select(driver.findElement(By.id("optionPrograms")));
				System.out.println(programDropdown);
				programDropdown.selectByIndex(1);
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (TestNGException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

}
}
*/