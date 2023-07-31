package com.qa.wework.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.wework.base.BaseTest;
import com.qa.wework.constants.AppConstants;
import com.qa.wework.pages.CreatePage;
import com.qa.wework.pages.HomePage;


public class CreatePageTest extends BaseTest{
	
	@BeforeClass
	public void createPageSetUp() {
		createPage = new CreatePage(driver);
	}
	
	@Test(priority=1)
	public void createPageTitleTest() {
		String actAccPageTitle = createPage.getCreatePageTitle();
		Assert.assertEquals(actAccPageTitle, AppConstants.CREATE_PAGE_TITLE);
	}
	
	@Test(priority=2)
	public void createPageBtnExistTest() {
		Assert.assertTrue(createPage.isCreatePageBtnExist());
	}
	
	@Test(priority=3)
	public void createBlogBtnExistTest() {
		Assert.assertTrue(createPage.isCreateBlogExist());
	}
	
}
