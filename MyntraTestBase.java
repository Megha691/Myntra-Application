package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pages.MyntraPages;

public class MyntraTestBase {
	
	WebDriver driver;
	MyntraPages MyntraOR;
	
     
	@BeforeClass
	public void setup() {
			System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
				
			 MyntraOR = new MyntraPages(driver);
					 driver.get("https://www.myntra.com/");
		}

		@AfterClass
			public void tearDown() {
				driver.close();	
			}
		}

