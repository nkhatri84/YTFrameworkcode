package bdd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.page.login;
import org.testing.page.logout;
import org.testing.utilities.LogsUtilities;
import org.testing.utilities.ScreenShotUtilites;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDF_1 extends Base{
	@Test(dataProvider="dp1")
	public void Signin1(String username, String password) throws InterruptedException, IOException {

		WebElement login=(WebElement) driver.findElement(By.xpath(pr.getProperty("Login_button")));
		login.click();
		login l=new login(driver,pr);
		l.signin(username,password);
		driver.navigate().back();
		
	}
	@DataProvider
	public Object[][] dp1() throws BiffException, IOException
	{
		{
	    	File f=new File("C:\\Users\\pc\\Desktop\\testcases.xls");
	    	Workbook wk=Workbook.getWorkbook(f);
	    	Sheet ws=wk.getSheet(0);
	    	int rows=ws.getRows();
	    	int columns=ws.getColumns();
	    	Object[][] ob=new Object[rows][columns];
	    	for(int i=0;i<rows;i++)
	    	{
	    		for(int j=0;j<columns;j++)
	    		{
	    			Cell c1=ws.getCell(j, i);
	    			ob[i][j]=c1.getContents();
	    		}
	    		
	    	}
	    	return ob;
	    	
	    	
	    	
	    }
	}
		

	
}
