package com.selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("timerAlertButton")).click();
		
WebDriverWait wait = new WebDriverWait(driver, 7);
wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();

	}

}
