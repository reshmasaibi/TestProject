package com.automation.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserFactory;

public class FacebookTestCase extends BaseClass {
	
	@Test
	public void loginTest()
	{

	//	LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginObjects("8805206304","Sagar5573");
		
	}
//	@Test
//	public void Test1()
//	{
//driver.get("http://www.youtube.com");
//	}
//	@Test
//	public void Test2()
//	{
//driver.get("http://www.google.com");
//	}
	
	

}
