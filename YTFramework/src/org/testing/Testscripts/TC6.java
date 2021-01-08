package org.testing.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC6 extends Base{
	
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
		Actions as=new Actions(driver);
		as.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		WebElement input=driver.findElement(By.xpath("//yt-formatted-string[@id='simplebox-placeholder']"));
		input.click();
		Thread.sleep(5000);
		WebElement comment=driver.findElement(By.xpath("//div[@id='contenteditable-root']"));
        comment.sendKeys("Nice video.");
        WebElement submitcomment=driver.findElement(By.xpath("//paper-button[@id='button' and @aria-label='Comment']"));
        submitcomment.click();
        Thread.sleep(5000);
		WebElement icon=driver.findElement(By.id("img"));
		icon.click();
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.xpath("//*[@href='/logout']"));
		logout.click();
	}

}
