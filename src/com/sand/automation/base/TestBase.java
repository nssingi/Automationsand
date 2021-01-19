package com.sand.automation.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	//member or class variables
	public static WebDriver driver;
	
	//Constructor same as class name with no return type
	public TestBase() {
		intialiazeBrowser();
		
	}
	
	
	
	//Method to instatiate the browser
	
	public void intialiazeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\Software\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.get("https://www.demoqa.com/books");
		 driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
