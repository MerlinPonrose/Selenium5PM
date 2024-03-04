package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			WebElement googleSearch = driver.findElement(By.name("q"));
			googleSearch.click();
			googleSearch.clear();
			googleSearch.sendKeys("Selenium Java");

			googleSearch.sendKeys(Keys.ENTER);
			
	}

}
