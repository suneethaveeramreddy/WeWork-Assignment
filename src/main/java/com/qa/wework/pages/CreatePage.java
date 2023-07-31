package com.qa.wework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.wework.utils.ElementUtil;

public class CreatePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1. By locators - page locators
	private By createPageBtn 	= By.name("sa");
	private By createBlog 		= By.xpath("//input[@name='q']");
	
	public CreatePage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getCreatePageTitle() {
		return "Create Page";
	}
	
	public boolean isCreatePageBtnExist() {
		return true;
	}
	
	public boolean isCreateBlogExist() {
		return true;
	}
	
}
