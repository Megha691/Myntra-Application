package com.qa.testscript;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.MyntraPages;
import com.qa.utility.ExcelUtility;

public class MyntraExcel extends MyntraTestBase{
	
	@Test
	(dataProvider="getData")
	
	
	public void SearchDress(String Input) throws InterruptedException {
		MyntraPages MyntraOR = new MyntraPages(driver);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		MyntraOR.getSearchbtn().sendKeys(Input);
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
		Thread.sleep(3000);
	    MyntraOR.getAddToBag().click();
	    MyntraOR.getGoToBag().click();
		MyntraOR.getPlaceOrder().click();	
	}		

	
	@DataProvider
	public String[][] getData() throws IOException {
		String x1path="C:\\Users\\happy\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\qa\\TestData\\Sheet1.xlsx";
		String x1Sheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(x1path, x1Sheet);
		int cellCount = ExcelUtility.getCellCount(x1path,x1Sheet,rowCount);
		String[][] data = new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
		for(int j=0;j<cellCount;j++) {
			data[i-1][j] =ExcelUtility.getCellData(x1path,x1Sheet,i,j);
			
		}
	}
		return data;

	}
}


