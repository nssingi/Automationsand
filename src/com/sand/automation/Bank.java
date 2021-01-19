package com.sand.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
 

public class Bank {
	
	
		public static void main(String[] args) {

				
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sandh\\Software\\edgedriver_win32\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.com");

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//WebElement googlsearchtext = driver.findElement(By.name("q"));
	WebElement googlsearchtext = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		}
}
