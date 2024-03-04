package com.selenium.windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		driver.findElement(By.xpath("//button[text()='click ']")).click();
		
		String parentid = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<String>(set);
		
		String childid = list.get(0);
		
		driver.switchTo().window(childid);
		
		

	}

}
