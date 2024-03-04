package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Parameter {
	
	
	@org.testng.annotations.Test
	@Parameters({"emaill","passwordd"})
	public void sigin(String email, String pass)
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/SignIn.html");
		
		
		WebElement emailtextbox = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
		
		emailtextbox.click();
		emailtextbox.clear();
		emailtextbox.sendKeys(email);
		
		WebElement passtextbox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		passtextbox.click();
		passtextbox.clear();
		passtextbox.sendKeys(pass);
		
	}
		


}
