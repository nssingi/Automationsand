package com.sand.automation.utilslib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utilities {
	
	public WebDriver getDriverInstance() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//DesiredCapabilities descap = new DesiredCapabilities();
		//descap.setCapability(capabilityName, value);
		return (driver);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
