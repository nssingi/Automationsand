package com.sand.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sand.automation.base.TestBase;

public class LoginPageobject extends TestBase {

	public LoginPageobject() {

		//super();
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(how = How.NAME, using="uid")
	WebElement userId;
	
	@FindBy(how = How.NAME, using = "password")
	WebElement password;
		
	
	@FindBy(how = How.NAME, using="btnLogin")
	WebElement loginbtn;

	//@FindBy(how = How.ID, using = "userName")
	//WebElement userId;

	//@FindBy(how = How.ID, using = "password")
	//WebElement password;
	
	@FindBy(how=How.CSS, using = "ul.menu-list > li:nth-child(2)")
	WebElement allmenulist;
	
	@FindBy(how = How.CSS, using = "#tree-node > ol > li > span > button")
	WebElement expandbtn;

	// methods to interact with object
	public void loginBtnClick() {
		loginbtn.click();
	}
	

	public void enterUsername(String strUsername) {
		userId.sendKeys(strUsername);
	}

	public void enterPassword(String strPassword) {
		password.sendKeys(strPassword);

	}
	public void clickMenu() {
		allmenulist.click();
			
	}
	public void clickexapnd() {
	WebElement expandbtn = driver.findElement(By.cssSelector("#tree-node > ol > li > span > button"));
	expandbtn.click();
	
	}
	
	
	public static void main(String[] args) {
		
		LoginPageobject lgpageobject = new LoginPageobject();
		  //lgpageobject.loginBtnClick();
		  lgpageobject.enterUsername("mngr304153");
		  lgpageobject.enterPassword("ehyvUte");
		  lgpageobject.loginBtnClick();
		 /* try {
				Thread.sleep(1000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		  lgpageobject.clickMenu();
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		  lgpageobject.clickexapnd();
	  }*/
		  
	}
}

	
	


