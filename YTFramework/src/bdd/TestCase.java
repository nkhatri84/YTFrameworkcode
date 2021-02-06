package bdd;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestCase {
    @Test(dataProvider="dp2")
	public void testcase1(String username, String password)
	{
System.out.println(username);
System.out.println(password);
	
}
   @DataProvider
    public Object[][] dp1()
    {
    	Object[][] ob=new Object[3][2];
    	ob[0][0]="User1";
    	ob[0][1]="password1";
    	ob[1][0]="User2";
    	ob[1][1]="password2";
    	ob[2][0]="User3";
    	ob[2][1]="password3";
    	
    	return ob;
    	
    }
    @DataProvider
    public Object[][] dp2() throws BiffException, IOException
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

