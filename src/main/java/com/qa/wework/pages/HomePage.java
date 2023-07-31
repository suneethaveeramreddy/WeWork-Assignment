package com.qa.wework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.wework.constants.AppConstants;
import com.qa.wework.utils.ElementUtil;

public class HomePage {
	
		private WebDriver driver;
		private ElementUtil eleUtil;
	
	//1. By locators - page locators
	private By searchBtn 		= By.name("sa");
	private By searchIcon 		= By.xpath("//input[@name='q']");
	
	
	//2. Page Constructor 
	public HomePage(WebDriver driver) {
		this.driver=driver;
		eleUtil =new ElementUtil(driver);
	}
	
	//3. Public Page actions/methods 
	public String getHomePageTitle() {
		String title = eleUtil.waitForTitleContains(AppConstants.Home_PAGE_TITLE, AppConstants.SHORT_TIME_OUT);
		System.out.println("Home page title is: " +title);
		return title;
	}
	
	public String getHomePageURL() {
		String url = eleUtil.waitForURLContains(AppConstants.Home_PAGE_URL_FRACTION, AppConstants.SHORT_TIME_OUT);
		System.out.println("Home page url is: " + url);
		return url;
	}
	public boolean isSearchBtnExist() {
		return eleUtil.waitForElementVisible(searchBtn, AppConstants.MEDIUM_TIME_OUT).isDisplayed();
	}
	
	public ProgrammableSearchEngine doSearch(String searchKey) {
	   WebElement searchField = eleUtil.waitForElementVisible(searchIcon, AppConstants.MEDIUM_TIME_OUT);
	   searchField.clear();
	   searchField.sendKeys(searchKey);
	   eleUtil.doClick(searchBtn);
	   return new ProgrammableSearchEngine(driver);
	}

}
