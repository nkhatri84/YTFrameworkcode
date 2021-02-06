package org.testing.page;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.LogsUtilities;

public class login {
	ChromeDriver driver; 
	Properties pr;
	public login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void signin(String username,String password) throws InterruptedException
	{
		
		WebElement user=driver.findElement(By.id(pr.getProperty("Username")));
		user.sendKeys(username);
		WebElement next=driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
		next.click();
		Thread.sleep(5000);
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("Password1")));
		pass.sendKeys(password);
		WebElement next1=driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
		next1.click();
		Thread.sleep(5000);
		
		
}
}
