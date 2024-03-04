package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
	
	@Test
	public void excelread() throws IOException
	{
		File f = new File("C:\\neworkspace\\Selenium5PM\\Resource\\dataa.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		
		int row_count = sheet.getLastRowNum();
		
		System.out.println(row_count);
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(colcount);
		
	/*	XSSFCell cell = sheet.getRow(1).getCell(0);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);*/
		
		for(int i=0;i<=row_count;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				XSSFCell cell = sheet.getRow(i).getCell(j);
				
				cell.setCellType(CellType.STRING);
				
				String value = cell.getStringCellValue();
				
				System.out.print(value+"  ");
			}
			System.out.println("");
		}
		
	}

}
