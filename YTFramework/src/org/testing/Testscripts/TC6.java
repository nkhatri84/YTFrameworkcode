package org.testing.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.Base;
import org.testing.page.login;
import org.testing.page.logout;
import org.testing.page.videoplay;
import org.testing.utilities.LogsUtilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC6 extends Base{
	
	@Test
	public void Login() throws InterruptedException
	{
		WebElement login=(WebElement) driver.findElement(By.xpath("//*[@aria-label='Sign in']"));
		login.click();
		login l=new login(driver,pr);
		l.signin("testeng23@gmail.com","Goodgreat12");
		Thread.sleep(5000);
		LogsUtilities.takelogs("login sucessful for TC6", "TC6");
        videoplay v=new videoplay(driver,pr);
		v.video();
		Actions as=new Actions(driver);
		as.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		WebElement input=driver.findElement(By.xpath("//yt-formatted-string[@id='simplebox-placeholder']"));
		input.click();
		Thread.sleep(5000);
		WebElement comment=driver.findElement(By.xpath(pr.getProperty("Comment")));
        comment.sendKeys("Nice video.");
        WebElement submitcomment=driver.findElement(By.xpath(pr.getProperty("Submitbutton")));
        submitcomment.click();
        Thread.sleep(5000);
		WebElement icon=driver.findElement(By.id("img"));
		icon.click();
		Thread.sleep(5000);
		logout l1=new logout(driver,pr);
        l1.signout();
        LogsUtilities.takelogs("TC6 passed", "TC6");

	}
}
