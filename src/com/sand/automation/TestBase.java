package com.sand.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public  WebDriver driver;
	
	public TestBase(){
		TestBase testbase = new TestBase();
		//driver =testbase.startBrowserInstnace();	
		
	}
	
	public WebDriver getWebdriver() {
		if(driver != null) {
			return driver;
		} else {
			TestBase testbase = new TestBase();
			driver =testbase.startBrowserInstnace();
			return driver;
		}
	}
	
	public WebDriver startBrowserInstnace() {
		System.setProperty("webdriver.chrome.driver", "c://sandhya/chromdrviver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/books");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		return driver;
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
