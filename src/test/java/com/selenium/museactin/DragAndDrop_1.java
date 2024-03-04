package com.selenium.museactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/dragabble");
		
		WebElement dragMeBox = driver.findElement(By.id("dragBox"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(dragMeBox, 0, 100).build().perform();
		
		
		act.dragAndDropBy(dragMeBox, 0, -100).build().perform();
		
		act.dragAndDropBy(dragMeBox, 100, 100).build().perform();
		

	}

}
