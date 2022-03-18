package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

//Excel sheet integration with java
public class ExcelEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("DataLogin1.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet ss = wb.getSheet("Sheet1");
		int rows = ss.getRows();
		int columns = ss.getColumns();
		System.out.println("Number of rows >> " + rows);
		System.out.println("Number of columns >> " + columns);
//		Cell cc = ss.getCell(0, 1); //zero columns first row 
//		String data = cc.getContents();
//		System.out.println(data);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell cc = ss.getCell(j, i); // zero columns first row
				String data = cc.getContents();
				System.out.println(data);
			}
		}
	}
}
