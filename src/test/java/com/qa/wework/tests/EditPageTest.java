package com.qa.wework.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wework.base.BaseTest;
import com.qa.wework.constants.AppConstants;
import com.qa.wework.pages.CreatePage;
import com.qa.wework.pages.EditPage;

public class EditPageTest extends BaseTest {

	@BeforeClass
	public void editPageSetUp() {
		editPage = new EditPage(driver);
	}
	
	@Test(priority=1)
	public void editPageTitleTest() {
		String actAccPageTitle = editPage.getEditPageTitle();
		Assert.assertEquals(actAccPageTitle, AppConstants.EDIT_PAGE_TITLE);
	}
	
	@Test(priority=2)
	public void editPageBtnExistTest() {
		Assert.assertTrue(editPage.isEditPageBtnExist());
	}
	
	@Test(priority=3)
	public void editBlogBtnExistTest() {
		Assert.assertTrue(editPage.isEditBlogExist());
	}
	
}

