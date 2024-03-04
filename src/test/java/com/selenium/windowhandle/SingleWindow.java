package com.selenium.windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		
		driver.findElement(By.xpath("//button[text()='click']")).click();
	String parentid = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			String childid = it.next();
			if(!childid.equalsIgnoreCase(parentid))
			{
				driver.switchTo().window(childid);
				driver.findElement(By.xpath("//a[@href='/downloads']")).click();
			}
		}
driver.switchTo().window(parentid);

driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
	}

}
