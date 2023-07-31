package com.qa.wework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.wework.factory.DriverFactory;
import com.qa.wework.pages.CreatePage;
import com.qa.wework.pages.DeletePage;
import com.qa.wework.pages.EditPage;
import com.qa.wework.pages.HomePage;
import com.qa.wework.pages.ProgrammableSearchEngine;

public class BaseTest {
	protected WebDriver driver;
	protected HomePage homePage;
	protected CreatePage createPage;
	protected EditPage editPage;
	protected DeletePage deletePage;
	protected ProgrammableSearchEngine programmableSearchEngine;
	DriverFactory df;
		
	@BeforeTest()
	public void setUp() {
		df=new DriverFactory();
		driver=df.initDriver("chrome");
		homePage = new HomePage(driver);
	}
	
	@AfterTest()
	public void tearDown() {
		driver.quit();
	}

}
