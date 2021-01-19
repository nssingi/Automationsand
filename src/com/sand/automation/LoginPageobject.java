package com.sand.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageobject extends TestBase {
		
	//constructor for login page object
	public LoginPageobject() {
		TestBase testbase = new TestBase();
		//WebDriver driver =testbase.startBrowserInstnace();
		WebDriver driver =testbase.getWebdriver();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.ID, using="username")
	WebElement username;
	
	@FindBy(how=How.ID, using="password")
	WebElement password;
	
	//methods to interact with object
	
	public void enterUsername(String strUsername) {
			username.sendKeys("");
	}
	
	public void enterPassword(String strPassword) {
			password.sendKeys(strPassword);
			 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
