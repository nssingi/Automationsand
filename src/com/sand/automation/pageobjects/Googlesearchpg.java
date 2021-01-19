package com.sand.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Googlesearchpg {
	@FindBy(how = How.XPATH, using="//*[@id=\\'tsf\\']/div[2]/div[1]/div[1]/div/div[2]/input") 
	WebElement serachtext;
	WebDriver driver;
	//WebDriver driver;
	//with page factory 
	//@FindBy(id = "searchBox")
	//WebElement searchNSETxt;
	
	//without page factory 
	
	//WebElement searchNSETxt=driver.findElement(By.id("searchBox"));
	public Googlesearchpg (WebDriver driver)
	{
	              this.driver = driver;
	}
	
	
	
	public void enterSearchtext() {
		driver.get("https://www.google.com");
		serachtext.sendKeys("Selenium");
		serachtext.sendKeys(Keys.ENTER);
	}

	//@FindBy(id="EmailAddress") 
	//initElements(WebDriver driver, java.lang.Class pageObjectClass)
//WebElement Email;
	
	//‘How’ is a class and it has static variables like ID, XPATH, CLASSNAME, LINKTEXT, etc.
	//‘using’ – To assign a value to a static variable.

}
