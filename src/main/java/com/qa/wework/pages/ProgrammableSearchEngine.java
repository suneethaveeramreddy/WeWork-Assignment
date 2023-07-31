package com.qa.wework.pages;

import org.openqa.selenium.WebDriver;

import com.qa.wework.utils.ElementUtil;

public class ProgrammableSearchEngine {
	
	private WebDriver driver;
	private ElementUtil eleUtil;

	public ProgrammableSearchEngine(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}

}
