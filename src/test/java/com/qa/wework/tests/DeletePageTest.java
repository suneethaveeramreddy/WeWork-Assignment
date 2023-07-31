package com.qa.wework.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wework.base.BaseTest;
import com.qa.wework.constants.AppConstants;
import com.qa.wework.pages.CreatePage;
import com.qa.wework.pages.DeletePage;

public class DeletePageTest extends BaseTest{

	@BeforeClass
	public void deletePageSetUp() {
		deletePage = new DeletePage(driver);
	}
	
	@Test(priority=1)
	public void deletePageTitleTest() {
		String actAccPageTitle = deletePage.getDeletePageTitle();
		Assert.assertEquals(actAccPageTitle, AppConstants.DELETE_PAGE_TITLE);
	}
	
	@Test(priority=2)
	public void deletePageBtnExistTest() {
		Assert.assertTrue(deletePage.isDeletePageBtnExist());
	}
	
	@Test(priority=3)
	public void createBlogBtnExistTest() {
		Assert.assertTrue(deletePage.isDeleteBlogExist());
	}
	
}
