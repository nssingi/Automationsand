package com.sand.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
	}
     By uName = By.id("userName");
	  //Locator for password field
	 By pswd = By.id("password");
	 	 //Locator for login button
	 By loginBtn = By.id("login");
	  
	 //Method to enter username
	 public void enterUsername(String user) {
	 driver.findElement(uName).sendKeys(user);
	 }
	 
	 //Method to enter password
	 public void enterPassword(String pass) {
	 driver.findElement(pswd).sendKeys(pass);
	 }
	 
	 public void clciklogin() {
	//Click on the login button
	 driver.findElement(loginBtn).click();
	 
	 //Print the web page heading
	 System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());
	 
	 //Click on Logout button
	// driver.findElement(By.id("submit")).click();
	 }
	 
	
	

	public static void main(String[] args) {
	
		// driver.quit();
		

	}

}
