package com.sand.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.List;

//import org.apache.commons.io.FileUtils;  
 

public class Googletest {
	
	
		public static void main(String[] args) {
			//microsoft edge
			/*System.setProperty("webdriver.edge.driver", "C:\\Users\\sandh\\Software\\edgedriver_win32\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.com");*/
			//chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\Software\\chromedriver_win32\\chromedriver.exe");
			
			DesiredCapabilities descap = new DesiredCapabilities();
			descap.setCapability("browsername", "chrome");
			ChromeDriver driver = new ChromeDriver(descap);
			//driver.get("http://sur.ly/i/demo.guru99.com/");
			driver.get("https://www.demoqa.com/books");
			 
			 //Locating the Login button and clicking on it
			 driver.findElement(By.id("login")).click();
			 
			 //Locating the username & password and passing the credentials
			 driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
			 driver.findElement(By.id("password")).sendKeys("Password@123");
			 
			 //Click on the login button
			 driver.findElement(By.id("login")).click();
			 
			 driver.findElement(By.cssSelector("div.header-text")).click();
			 String title1 = driver.getCurrentUrl();
				System.out.println("title of the page si "+ title1);
			// driver.findElement(By.xpath("//*[@id='item-1']")).click();
			//*[@id="item-5"]
			//System.out.println("text1 is " + text1);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			WebElement allmenulist= driver.findElement(By.cssSelector("ul.menu-list > li:nth-child(2)"));
			allmenulist.click();
			String title2 = driver.getCurrentUrl();
			System.out.println("title of the page si "+ title2);
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			WebElement expandbtn = driver.findElement(By.cssSelector("#tree-node > ol > li > span > button"));
			expandbtn.click();
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			WebElement desktop1 = driver.findElement(By.cssSelector("input#tree-node-desktop"));

		 Actions ActionChains = new Actions(driver);
	
				ActionChains.moveToElement(desktop1).perform();
				Action seriesofaction;
				seriesofaction.
				click(desktop1).perform();
			////*[@id="tree-node"]/ol/li/span/label/span[1]
			
			
		//	WebElement allmenulist= driver.findElement(By.cssSelector("ul.menu-list > li:nth-child(1)"));
			//allmenulist.click();
			// "#sort-list > li:nth-child(1)
			 //allmenulist.get(1).click();
		//	for(WebElement menu :allmenulist ) {
			//ystem.out.println(menu.getText());
		//
			
				//WebElement mySelectElement = driver.findElement(By.cssSelector("ul.menu-list/li"));
				//Select dropdown= new Select(mySelectElement);
				//To select an option - selectByVisibleText, selectByIndex, selectByValue
				//selectByVisibleText
				//dropdown.selectByVisibleText("Links");
			
			 
			 
			//*[@id="app"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul
			 
			 
			 
			// driver.findElement(By.cssSelector("span#text")).click();
		//	WebElement serachText = driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input"));
			//serachText.sendKeys("Selenium");
			//serachText.sendKeys(Keys.ENTER);
			 
			 //capture screenshot
			//*[@id="item-1"]
			 
			 
			 
		//	TakesScreenshot scfile =  (TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Files.copyFile(scfile, new File("C:\\Screenshot\\Scr.jpg"))  		 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		//	driver.close();
			
	//		driver.quit();
			
			

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
			
			//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
	/*JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	 WebElement startButton = (WebElement) driver).executeScript("document.querySelector(\'body > ntp-app\').shadowRoot.querySelector(\'#realbox\').shadowRoot.querySelector(\'#input\');");
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", startButton );
	//String url=js.executeScript("return document.URL;").toString();
	js.executeScript("document.querySelector(\"body > ntp-app\").shadowRoot.querySelector(\"#realbox\").shadowRoot.querySelector(\"#input\")", "googlsearchtext");
	
	js.executeScript("arguments[0].click();", googlsearchtext);
	//System.out.println("url is "+ url);
	//C:\Users\sandh\Software\chromedriver_win32
	googlsearchtext.sendKeys("selenium");
	googlsearchtext.sendKeys("Keys.ENTER");*/
	
	

}
	
}
