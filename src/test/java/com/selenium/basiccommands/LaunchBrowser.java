package com.selenium.basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
	/*	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();*/
		
		
		WebDriverManager.iedriver().setup();
		
		driver = new InternetExplorerDriver();
		
	}

}
