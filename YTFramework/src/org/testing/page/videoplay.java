package org.testing.page;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class videoplay {
	ChromeDriver driver; 
	Properties pr;
	public videoplay(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void video() throws InterruptedException
	{
		
		List<WebElement> ls=driver.findElements(By.id("video-title"));
		ls.get(9).click();
		Thread.sleep(5000);
}
}
