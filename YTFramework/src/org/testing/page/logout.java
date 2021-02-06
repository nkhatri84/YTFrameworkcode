package org.testing.page;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout {
	ChromeDriver driver; 
	Properties pr;
	public logout(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void signout()	{
		
		WebElement logout=driver.findElement(By.xpath(pr.getProperty("Logout")));
		logout.click();
}

}
