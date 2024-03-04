package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement menu = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		
		System.out.println(menu.getText());

	}

}
