package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	//	WebElement fname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
		WebElement fname =	driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		
		fname.click();
		fname.clear();
		fname.sendKeys("helo");
		
		WebElement header = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
		
	
		String headder = header.getText();
		
		System.out.println(headder);

	}

}
