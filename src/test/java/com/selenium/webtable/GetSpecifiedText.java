package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSpecifiedText {

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
				
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=1;j<=colcount;j++)
			{
				WebElement findElement = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]"));
				
				String text = findElement.getText();
				
				String trimtext = text.trim();
				
				
				if(trimtext.contains("JK Tyre & Industries"))
				{
					System.out.println("Row="+i);
					System.out.println("Col="+j);
					
					WebElement findElement2 = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td[4]"));
					System.out.println(findElement2.getText());
				}
				
			}
		
		}

		
	}

}
