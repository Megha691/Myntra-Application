package com.qa.testscript;

import java.util.Set;

import org.testng.annotations.Test;

import com.qa.pages.MyntraPages;
	@Test
	public class MyntraApplication extends MyntraTestBase{
	
		public void SearchDress() throws InterruptedException {
			MyntraPages MyntraOR = new MyntraPages(driver);
			
			MyntraOR.getwomenbutton().click();
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
			
			MyntraOR.getSize().click();
		    MyntraOR.getAddToBag().click();
			MyntraOR.getGoToBag().click();
			MyntraOR.getPlaceOrder().click();	
		}		
	}

