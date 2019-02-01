package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.automation.utilities.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver = BrowserFactory.startApplication(driver,"chrome", "http://www.facebook.com");

	}


	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);

	}
}
