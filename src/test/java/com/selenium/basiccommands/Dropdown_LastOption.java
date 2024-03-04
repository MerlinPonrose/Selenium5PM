package com.selenium.basiccommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_LastOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skills_dropdown = driver.findElement(By.id("Skills"));
		
		Select dropdown = new Select(skills_dropdown);
		
		List<WebElement> options = dropdown.getOptions();
		
		int count = options.size();
		
		dropdown.selectByIndex(count-1);

	}

}
