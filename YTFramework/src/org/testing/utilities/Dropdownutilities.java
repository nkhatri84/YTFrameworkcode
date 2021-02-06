package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownutilities {
	public void selectbyindex(WebElement we1, int indexnumber)
	{
		Select s=new Select(we1);
		s.selectByIndex(indexnumber);
	}
	
	public void selectbyvisibletext(WebElement we2, String visibletext)
	{
		Select s1=new Select(we2);
		s1.selectByVisibleText(visibletext);
	}
	
	public void selectbyvalue(WebElement we3, String value)
	{
		Select s2=new Select(we3);
		s2.selectByValue(value);
	}

}
