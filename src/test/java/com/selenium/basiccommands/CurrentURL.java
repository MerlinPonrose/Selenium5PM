package com.selenium.basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.firstcry.com/");
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
String pageSource =		driver.getPageSource();
System.out.println(pageSource);

	}

}
