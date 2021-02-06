package org.testing.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertions.Softassertion;
import org.testing.base.Base;
import org.testing.page.login;
import org.testing.page.logout;
import org.testing.page.videoplay;
import org.testing.utilities.LogsUtilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TC4 extends Base{
	
	@Test
	public void Login() throws InterruptedException
	{
		WebElement login=(WebElement) driver.findElement(By.xpath("//*[@aria-label='Sign in']"));
		login.click();
		login l=new login(driver,pr);
		l.signin("testeng23@gmail.com","Goodgreat12");
		Thread.sleep(5000);
		LogsUtilities.takelogs("login sucessful for TC4", "TC4");
        videoplay v=new videoplay(driver,pr);
		v.video();
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com");
		Softassertion.assertion("https://www.youtube.com", driver.getCurrentUrl());
		WebElement like=driver.findElement(By.xpath(pr.getProperty("Like")));
        like.click();
		Thread.sleep(5000);
		WebElement icon=driver.findElement(By.id("img"));
		icon.click();
		Thread.sleep(5000);
		logout l1=new logout(driver,pr);
        l1.signout();
        LogsUtilities.takelogs("TC4 passed", "TC4");

	}	
}
