package com.selenium.museactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag = driver.findElement(By.xpath("(//li[@data-id='2'])[1]"));
		
		WebElement drop = driver.findElement(By.id("amt7"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		

	}

}
