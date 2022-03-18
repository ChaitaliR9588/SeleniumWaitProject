package com.jbk;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

//ExcelSheet integration with Data Provider
public class DP_with_ExcelSheet {
  @Test(dataProvider = "dpExcel")
  public void f(String uname, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

  @DataProvider
  public Object[][] dpExcel() throws Exception {
	  FileInputStream fis = new FileInputStream("DataLogin1.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet ss = wb.getSheet("Sheet1");
		int rows = ss.getRows();
		int columns = ss.getColumns();
		System.out.println("Number of rows >> " + rows);
		System.out.println("Number of columns >> " + columns);
		String arrdata[][] = new String[rows][columns];
//		Cell cc = ss.getCell(0, 1); //zero columns first row 
//		String data = cc.getContents();
//		System.out.println(data);
		//or
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell cc = ss.getCell(j, i); // zero columns first row
				String data = cc.getContents();
				System.out.println(data);
				//logic of arrdata
				arrdata[i][j] = data;
			}
		}  
		
		return arrdata;
  }
  }
