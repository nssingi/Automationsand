package com.sand.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PomwoPageFactory {
	//1. create page class with all methods and properties
	
	WebDriver driver;
	//Locator for login button
	 By LoginBtn = By.id("login");
	 
	 //Method to click login button
	 public void clickLogin() {
	 driver.findElement(LoginBtn).click();
	 }
	
	public PomwoPageFactory(WebDriver driver) {
		this.driver = driver;
		}
	 
	// driver.get("https://www.demoqa.com/books");
    //properties and methods
	
	
	
	
	

}
