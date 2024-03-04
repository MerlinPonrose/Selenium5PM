package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
List<WebElement> col = table.findElements(By.tagName("th"));
		
		int colcount = col.size();
		
		for(int i=1;i<=colcount;i++)
		{
			WebElement fifthrowdata = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[5]//td["+i+"]"));
			String text = fifthrowdata.getText();
			
			System.out.println(text);
		}

	}

}
