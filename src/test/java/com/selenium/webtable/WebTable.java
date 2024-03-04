package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		List<WebElement> row = table.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		
		int rowcount = row.size();
		
		List<WebElement> col = table.findElements(By.tagName("th"));
		
		int colcount = col.size();
				
		
		System.out.println("row count="+rowcount);
		
		System.out.println("col count="+colcount);
		
		WebElement rowcoldata = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[4]//td[5]"));
		
		System.out.println(rowcoldata.getText());

	}

}
