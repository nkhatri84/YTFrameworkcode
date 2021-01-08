package org.testing.Testscripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class TC1 extends Base {
	
	
	@Test
	public void Login() throws InterruptedException, IOException
	{
		File f=new File("..//YTFramework/File");
		FileReader fr=new FileReader(f);
	    pr=new Properties();
	    pr.load(fr);
		WebElement login=(WebElement) driver.findElement(By.xpath(pr.getProperty("Login_button")));
		login.click();
		WebElement username=driver.findElement(By.id(pr.getProperty("Username")));
		username.sendKeys("testeng23@gmail.com");
		WebElement next=driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
		next.click();
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath(pr.getProperty("Password1")));
		password.sendKeys("Goodgreat12");
		WebElement next1=driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
		next1.click();
		Thread.sleep(5000);
		
		WebElement Trending=driver.findElement(By.xpath(pr.getProperty("Trending_button")));
		Trending.click();
		Thread.sleep(5000);
		WebElement icon=driver.findElement(By.id("img"));
		icon.click();
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.xpath(pr.getProperty("Logout")));
		logout.click();
	}
		
	}

