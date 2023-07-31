package com.qa.wework.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.wework.base.BaseTest;
import com.qa.wework.constants.AppConstants;

public class HomePageTest extends BaseTest{
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String actHomePageTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actHomePageTitle, AppConstants.Home_PAGE_TITLE);
	}
	
	@Test(priority=2)
	public void getHomePageURLTest() {
		String actURL = homePage.getHomePageURL();
		Assert.assertTrue(actURL.contains(AppConstants.Home_PAGE_URL_FRACTION));
	}
	
	@Test(priority=3)
	public void isSearchBtnExistTest() {
		Assert.assertTrue(homePage.isSearchBtnExist());
	}
	
	
	@Test(priority=4)
	public void searchTest() {
		programmableSearchEngine=homePage.doSearch("Selenium");
		Assert.assertEquals("Programmable Search Engine", AppConstants.ProgramSearchEngine_PAGE_TITLE);
	}
	

}
