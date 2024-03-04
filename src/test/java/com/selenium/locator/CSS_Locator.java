package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
	
		WebElement findElement = driver.findElement(By.cssSelector("textarea#APjFqb"));
		
		
	//	WebElement findElement = driver.findElement(By.cssSelector("textarea.gLFyf"));
		
//		WebElement findElement = driver.findElement(By.cssSelector("textarea[title='Search']"));
		findElement.click();
		findElement.clear();
		findElement.sendKeys("helo how are u");

	}

}
