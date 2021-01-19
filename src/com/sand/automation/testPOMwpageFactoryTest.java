package com.sand.automation;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testPOMwpageFactoryTest {
  @Test
  public void f() {
	
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\Software\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com/books");
	  Homepage hpage = new Homepage(driver);
	  PageFactory.initElements(driver, Homepage.class);
	 // hpage.clickLogin();
	//  Homepage hpage = new Homepage(driver);
	  hpage.clickLogin();
	  
	  Loginpage lpage = new Loginpage(driver);
	  PageFactory.initElements(driver, Loginpage.class);
	  lpage.enterUsername("gunjankaushik");
	  lpage.enterPassword("Password@123");
	  lpage.clciklogin();
	  
  }
}
