package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement Cricket = driver.findElement(By.id("checkbox1"));
		
		WebElement Movie = driver.findElement(By.id("checkbox2"));
		
		WebElement Hockey = driver.findElement(By.id("checkbox3"));
		
		Cricket.click();
		Hockey.click();
		
		System.out.println("Cricket="+Cricket.isSelected());
		
		System.out.println("Hockey="+Hockey.isSelected());
		
		System.out.println("Movie="+Movie.isSelected());
		
		Cricket.click();
		
		
		System.out.println("Cricket after uncheck="+Cricket.isSelected());

	}

}
