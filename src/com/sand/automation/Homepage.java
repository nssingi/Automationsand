package com.sand.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	//WebDriver driver;
	static WebDriver driver;
	 
	@FindBy(how = How.ID, using = "login")
	 @CacheLookup
	 static WebElement lnk_MyAccount;
	 
	 public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	// Locator for login button
	//By loginlnk = By.xpath("//*[@id=\'item-0\']/span");
//	By loginlnk = By.id("login");
	//driver.findElement(By.id("login")).click();
	
	public void clickLogin() {
		//driver.findElement(loginlnk).click();
		lnk_MyAccount.click();
	}

	public void eat() {
		System.out.println("I am eating");
	}	
	

}
