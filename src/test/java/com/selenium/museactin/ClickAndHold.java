package com.selenium.museactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/sortable");
		
		
		driver.findElement(By.xpath("//a[text()='Grid']")).click();
		
		WebElement three = driver.findElement(By.xpath("(//div[text()='Three'])[2]"));
		
		WebElement five = driver.findElement(By.xpath("(//div[text()='Five'])[2]"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(three).release(five).build().perform();

	}

}
