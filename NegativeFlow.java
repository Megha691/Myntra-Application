package com.qa.testscript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.MyntraPages;

public class NegativeFlow extends MyntraTestBase {
	

@Test
	public void SearchDress() throws InterruptedException {

	MyntraPages MyntraOR = new MyntraPages(driver);
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
	MyntraOR.getSearchbtn().sendKeys("Women Dress");
	MyntraOR.getGosearch().click();
	MyntraOR.getSelectDress().click();
	
	Set<String> win=driver.getWindowHandles();
	String han=null;
	for(String s:win)
	{
		System.out.println(s);
		han=s;
	}
	System.out.println(han);//to switch to the new tab
	driver.switchTo().window(han);
	Thread.sleep(3000);
	
	MyntraOR.getAddToBag().click();
	Thread.sleep(2000);
	String error=driver.findElement(By.xpath("//*[@id=\\\"sizeButtonsContainer\\\"]/div[2]/div[2]")).getText();
	Assert.assertEquals(error,"select a  dress size");
	
	}

}


