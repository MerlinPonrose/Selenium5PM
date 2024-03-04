package com.selenium.basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.firstcry.com/");
		
		String title = driver.getTitle();
		
		if(title.contains("Newborn Baby Products"))
		{
			System.out.println("text present");
		}
		
		else
		{
			System.out.println("not present");
		}
		
		System.out.println(title);

	}

}
