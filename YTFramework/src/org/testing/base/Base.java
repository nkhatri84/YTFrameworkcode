package org.testing.base;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void Browserlaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void browserclose()
	{
     driver.close();
	}
	

}
