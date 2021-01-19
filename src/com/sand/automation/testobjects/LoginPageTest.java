package com.sand.automation.testobjects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;

import com.sand.automation.base.TestBase;
import com.sand.automation.pageobjects.LoginPageobject;

public class LoginPageTest extends TestBase {
		
	
  @Test
  public void logintest() {
	  LoginPageobject lgpageobject = new LoginPageobject();
	  //lgpageobject.loginBtnClick();
	  lgpageobject.enterUsername("mngr304153");
	  lgpageobject.enterPassword("ehyvUte");
	  lgpageobject.loginBtnClick();
//	  try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//	  lgpageobject.clickMenu();
//	  try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//	  lgpageobject.clickexapnd();
  }
  
  
  

}
