package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver ldriver, String browserName, String url)
	{
		if(browserName.equals("chrome"))
		{
			System.out.println("Inside browser intialization");
			System.setProperty("webdriver.chrome.driver", "/Users/sagarsaibi/Downloads/Selenium3Libs/chromedriver");
			ldriver = new ChromeDriver();
		}
		if(browserName.equals("firefox"))
		{
			
		}
		ldriver.get(url);
	//	ldriver.manage().window().setSize(new Dimension(420, 280));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return ldriver;
		
		
	}

	public static void closeBrowser(WebDriver ldriver)
	{
		ldriver.close();
	}
}
