package com.sand.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardTestPage {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\Software\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.demoqa.com/books");
	 
	 //Creating object of home page
	 Homepage home = new Homepage(driver);
	 
	 //Creating object of Login page
	 Loginpage login = new Loginpage(driver);
	 
	 //Creating object of Dashboard
	 //DashboardTestPage dashboard = new Dashboard(driver);
	 home.eat();
	 //Click on Login button
	 //home.clickLogin();
	 
	 //Enter username & password
	 login.enterUsername("gunjankaushik");
	 login.enterPassword("Password@123");
	 
	 //Click on login button
	 login.clickLogin();
	// Thread.sleep(3000);
	 
	 
	 //Capture the page heading and print on console
	// System.out.println("The page heading is --- " +dashboard.getHeading());
	 
	}
	
}
