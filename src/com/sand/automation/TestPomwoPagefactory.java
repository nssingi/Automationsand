package com.sand.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPomwoPagefactory {
	WebDriver driver;
	
	
  @Test
  public void f() {
	  
	  //Create individual objects and call them.
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\Software\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  //navigate teh driver to the address:
	  driver.get("https://www.demoqa.com/books");
	  
	 //create homepage object
	  Homepage hpage = new Homepage(driver);
	  hpage.clickLogin();
	  
	  //create login page object
	  Loginpage lpage = new Loginpage(driver);
	  lpage.enterUsername("gunjankaushik");
	  lpage.enterPassword("Password@123");
	  lpage.clciklogin();
	  	  
	  //Create 
	  
	  DashBoardPage dashpage = new DashBoardPage(driver);
	  dashpage.getHeading();
	  
	  
	  
	  
  }	  
  
}
