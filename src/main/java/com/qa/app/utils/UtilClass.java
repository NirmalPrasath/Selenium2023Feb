package com.qa.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class UtilClass implements IRetryAnalyzer {
	
	static Workbook book;
	static Sheet sheet;
	//public static String filePath="C://Users//Rohith//eclipse-workspace//TestNGProject//src//test/resources//testData//LoginData.xlsx";
	
	public static String filePath=".//src//test/resources//testData//testData.xlsx";
	int maxRetrycount=3;
	int retryCount=0;
	/*public static void main(String[] args)
	{
		
		sheetPath("login");
		
	}*/

	
	public static Object[][] sheetPath(String sheetName)
	{
		FileInputStream file=null;
		try {
			file=new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetName);
		Object [][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	//	System.out.println("LastRowNumber: " + sheet.getLastRowNum());
		//System.out.println(sheet.getRow(0).getLastCellNum());
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
			
				//System.out.println(data[i][j]=sheet.getRow(i+1).getCell(j).toString());
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
		
	}
	
	

	public boolean retry(ITestResult result) {
	
		if(retryCount<maxRetrycount)
		{
			retryCount++;
			return true;
		}
		return false;
	}
	
	public static void selectClassDropdown(WebElement ele, String value)
	{
		Select dropdownValu=new Select(ele);
		
		List<WebElement> val =dropdownValu.getOptions();
		
		for(WebElement s:val)
		{
			if(s.getText().equals(value))
			{
				s.click();
				break;
			}
		}
		
		
	}
	
	public static void framHandeling(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	
}
