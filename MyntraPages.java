package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testscript.MyntraTestBase;

public class MyntraPages extends MyntraTestBase {

	WebDriver driver;
	public MyntraPages (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")
	WebElement womenbutton;
	public WebElement  getwomenbutton() {
		return  womenbutton;
	}
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")
	WebElement Searchbtn;
	public WebElement  getSearchbtn() {
		return  Searchbtn;
	}
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")
	WebElement Gosearch;
	public WebElement  getGosearch() {
		return  Gosearch;
	}
	
	
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div")
	WebElement SelectDress;
	public WebElement  getSelectDress() {
		return  SelectDress;
	}
	
	
	@FindBy(xpath="//*[@id=\"sizeButtonsContainer\"]/div[2]/div[2]")
	WebElement Size;
	public WebElement  getSize() {
		return  Size;
	}
	
	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")
	WebElement AddToBag;
	public WebElement getAddToBag() {
		return  AddToBag;
	}
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[3]")
	WebElement GoToBag;
	public WebElement getGoToBag() {
		return  GoToBag;
	}
	
	@FindBy(xpath="//*[@id=\"appContent\"]/div/div/div/div/div[2]/div[2]/div[3]/a/div")
	WebElement PlaceOrder;
	public WebElement getPlaceOrder() {
		return  PlaceOrder;
	}

}