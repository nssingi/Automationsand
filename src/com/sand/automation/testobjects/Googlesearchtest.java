package com.sand.automation.testobjects;

import org.testng.annotations.Test;

import com.sand.automation.pageobjects.Googlesearchpg;
import com.sand.automation.utilslib.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Googlesearchtest {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @Test
  
  public void searchGoogle() {
	  
	  WebDriver driver = null;
	  Utilities utillib = new Utilities();
	  
	 driver = utillib.getDriverInstance();
	 Googlesearchpg googser = new Googlesearchpg(driver);
	 googser.enterSearchtext();
	 
	  
	  
	
	  
  }
}
