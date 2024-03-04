package com.selenium.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {

	@Test
	public void validateText()
	{

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.firstcry.com/");
		
		String title = driver.getTitle();
		
		if(title.contains("aaaa"))
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
