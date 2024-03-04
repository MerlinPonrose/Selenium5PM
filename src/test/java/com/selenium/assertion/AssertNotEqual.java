package com.selenium.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertNotEqual {
	
	

	@Test
	public void assertequal()
	{

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.firstcry.com/");
		
		String title = driver.getTitle();
		
		Assert.assertNotEquals(title, "Baby Products Online India: Newborn Baby Products & Kids Onlin","Title is not expected");
		
		System.out.println("next line");
		
		driver.close();
	}


}
