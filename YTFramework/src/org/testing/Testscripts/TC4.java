package org.testing.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends Base{
	
	@Test
	public void Login() throws InterruptedException
	{
		WebElement login=(WebElement) driver.findElement(By.xpath("//*[@aria-label='Sign in']"));
		login.click();
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("testeng23@gmail.com");
		WebElement next=driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
		next.click();
		Thread.sleep(5000);
		WebElement password=(WebElement) driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
		password.sendKeys("Goodgreat12");
		WebElement next1=driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
		next1.click();
		Thread.sleep(5000);
		
		List<WebElement> ls=driver.findElements(By.id("video-title"));
		ls.get(2).click();
		Thread.sleep(5000);
		WebElement like=driver.findElement(By.xpath("//yt-icon-button[@id='button' and @class='style-scope ytd-toggle-button-renderer style-text']"));
        like.click();
		Thread.sleep(5000);
		WebElement icon=driver.findElement(By.id("img"));
		icon.click();
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.xpath("//*[@href='/logout']"));
		logout.click();
	}
	
}
