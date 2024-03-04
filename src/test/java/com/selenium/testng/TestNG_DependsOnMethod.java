package com.selenium.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_DependsOnMethod {
	
	
	
	@Test(priority=1,dependsOnMethods= {"alertcancel"},alwaysRun=true)
	public void alertOk() throws InterruptedException
	{
		
			System.out.println("in alert ok");
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.close();
		

	}
	
	@Test(priority=4)
	public void test()
	{
		System.out.println("priority 4");
	}
	
	@Test(priority=3)
	public void alertcancel()
	{
		
		System.out.println("In alert cancel");
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Canc']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		driver.close();
	}
	
	@Test(priority=2)
	public void alert_sendkeys()
	{
		
		System.out.println("In alert sendkeys");
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Selenium");
		
		a.accept();
		
		driver.close();

	}

}
