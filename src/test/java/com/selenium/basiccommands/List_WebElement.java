package com.selenium.basiccommands;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext())
		{
		WebElement element =	it.next();
		String text = element.getText();
		System.out.println(text);
		}
		

	}

}
