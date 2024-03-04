package com.selenium.testng;

import java.util.List;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Frame extends BaseClass{

	
	
	@Test
	public void singleframe()
	{
		
		System.out.println("In single frame");
		driver.get("https://demo.automationtesting.in/Frames.html");
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frame.size());
		
	//	driver.switchTo().frame("SingleFrame");
		
		WebElement iframe_loc = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		
		driver.switchTo().frame(iframe_loc);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		textbox.click();
		textbox.clear();
		textbox.sendKeys("hii");
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
	

	}
	
	@Test(groups= {"test"})
	public void nestedframe()
	{
		
		System.out.println("In nested frame");
		
		driver.get("https://demo.automationtesting.in/Frames.html");
	
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		WebElement outer_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outer_frame);
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frame.size());
		
		driver.switchTo().frame(0);
		
WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		textbox.click();
		textbox.clear();
		textbox.sendKeys("hii");
		
		
		driver.switchTo().parentFrame();
		
	
	}
	

}
