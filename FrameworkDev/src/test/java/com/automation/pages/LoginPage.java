package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") WebElement email;
	@FindBy(id="pass") WebElement pass;
	@FindBy(id ="loginbutton") WebElement lBtn;
	
	public void loginObjects(String uname, String pwd)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		email.sendKeys(uname);
		pass.sendKeys(pwd);
		lBtn.click();
	//	driver.findElement(By.id("pass")).sendKeys("Hello");
	}
	

}
