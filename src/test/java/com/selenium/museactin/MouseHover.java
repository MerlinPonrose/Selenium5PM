package com.selenium.museactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.firstcry.com/");
		
		WebElement Boyfashion = driver.findElement(By.xpath("//a[text()=' BOY FASHION']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Boyfashion).build().perform();
		
		Thread.sleep(15000);
		
		
		WebElement mittens = driver.findElement(By.xpath("//a[text()='Caps, Mittens & Booties' and @class='M13_42']"));
		
		act.moveToElement(mittens).build().perform();
		
		mittens.click();
		
	}

}
