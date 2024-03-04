package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			WebElement Address = driver.findElement(By.tagName("textarea"));
			Address.click();
			Address.clear();
			Address.sendKeys("Perungudi");

	}

}
