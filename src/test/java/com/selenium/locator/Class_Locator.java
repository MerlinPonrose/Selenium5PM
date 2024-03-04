package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.firstcry.com/");
			
			Thread.sleep(5000);
			
			WebElement searchbox = driver.findElement(By.className("input-text L14_9e"));
			
			searchbox.click();
			searchbox.clear();
			searchbox.sendKeys("Baby products");
			
			WebElement searchicon = driver.findElement(By.className("search-button"));
			searchicon.click();

	}

}
