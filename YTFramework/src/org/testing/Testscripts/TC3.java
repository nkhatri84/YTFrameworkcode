package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.page.login;
import org.testing.page.logout;
import org.testing.utilities.LogsUtilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 extends Base {
	
	@Test
	public void Login() throws InterruptedException
	{
		WebElement login=(WebElement) driver.findElement(By.xpath("//*[@aria-label='Sign in']"));
		login.click();
		login l=new login(driver,pr);
		l.signin("testeng23@gmail.com","Goodgreat12");
		LogsUtilities.takelogs("login sucessful for tC3", "TC3");
        WebElement Subscription=driver.findElement(By.xpath(pr.getProperty("Subscription")));
		Subscription.click();
		Thread.sleep(5000);
		WebElement icon=driver.findElement(By.id("img"));
		icon.click();
		Thread.sleep(5000);
		logout l1=new logout(driver,pr);
        l1.signout();
        LogsUtilities.takelogs("TC3 passed", "TC3");

	}		
}



