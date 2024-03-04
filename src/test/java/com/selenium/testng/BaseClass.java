package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
	System.out.println("In before method");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("In after method");
		driver.close();
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("In after test");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In beforetest");
	}
	

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("in before class");
	}
	

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("In beforesuite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	

}
