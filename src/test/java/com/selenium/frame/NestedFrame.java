package com.selenium.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
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
