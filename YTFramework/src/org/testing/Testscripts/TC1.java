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
import org.testing.page.login;
import org.testing.page.logout;
import org.testing.utilities.LogsUtilities;
import org.testing.utilities.ScreenShotUtilites;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class TC1 extends Base {
	
	@Test
	public void trending() throws InterruptedException, IOException {

		WebElement login=(WebElement) driver.findElement(By.xpath(pr.getProperty("Login_button")));
		login.click();
		login l=new login(driver,pr);
		l.signin("testeng23@gmail.com","Goodgreat12");
		Thread.sleep(5000);
		LogsUtilities.takelogs("login sucessful for tc1", "TC1");
		WebElement Trending=driver.findElement(By.xpath(pr.getProperty("Trending_button")));
		Trending.click();
		Thread.sleep(5000);
		WebElement icon=driver.findElement(By.id("img"));
		icon.click();
		Thread.sleep(5000);
		logout l1=new logout(driver,pr);
        l1.signout();
        LogsUtilities.takelogs("tc1 passed", "TC1");
        ScreenShotUtilites.takescreenshot(driver, "/YTFramework/src/org/testing/utilities/screenshot");
        
        
		}
}
