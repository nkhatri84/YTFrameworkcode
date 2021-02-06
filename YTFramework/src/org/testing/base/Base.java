package org.testing.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.LogsUtilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static ChromeDriver driver;
	public static Properties pr;
	@BeforeMethod
	public void Browserlaunch() throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		File f=new File("..//YTFramework/File");
		FileReader fr=new FileReader(f);
	    pr=new Properties();
	    pr.load(fr);
	}
	@AfterMethod
	public void browserclose()
	{
     driver.close();
     
     
	}
	

}
