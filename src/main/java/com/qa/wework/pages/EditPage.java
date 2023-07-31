package com.qa.wework.pages;

import org.openqa.selenium.WebDriver;

import com.qa.wework.utils.ElementUtil;

public class EditPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public EditPage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getEditPageTitle() {
		return "Edit Page";
	}
	
	public boolean isEditPageBtnExist() {
		return true;
	}
	
	public boolean isEditBlogExist() {
		return true;
	}
	
}
