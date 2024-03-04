package com.selenium.basiccommands;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_WebElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> label = driver.findElements(By.xpath("//label[@class='col-md-3 col-xs-3 col-sm-3 control-label']"));
		
		Iterator<WebElement> it = label.iterator();
		
		while(it.hasNext())
		{
			WebElement label_text = it.next();
			String text = label_text.getText();
		//	System.out.println(text);
			if(text.equalsIgnoreCase("Skills"))
			{
				System.out.println("Skills label is available");
			}
		}

	}

}
