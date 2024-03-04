package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public void ttest()
	{
		WebDriver driver ;
		
		driver	 = new ChromeDriver();
			
	driver.manage().window().maximize();


	driver.get("https://demo.automationtesting.in/Register.html");
	
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.click();
		fname.clear();
		fname.sendKeys("");
		
		
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.click();
		lname.clear();
		lname.sendKeys("");
		
		WebElement addr = driver.findElement(By.tagName("textarea"));
		addr.click();
		addr.clear();
		addr.sendKeys("");
		
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.click();
		email.clear();
		email.sendKeys("");
		
	}

}
