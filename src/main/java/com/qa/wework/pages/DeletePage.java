package com.qa.wework.pages;

import org.openqa.selenium.WebDriver;

import com.qa.wework.utils.ElementUtil;

public class DeletePage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public DeletePage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getDeletePageTitle() {
		return "Delete Page";
	}
	
	public boolean isDeletePageBtnExist() {
		return true;
	}
	
	public boolean isDeleteBlogExist() {
		return true;
	}
	
}
