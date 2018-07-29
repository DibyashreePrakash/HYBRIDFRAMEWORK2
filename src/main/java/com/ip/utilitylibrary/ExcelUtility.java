package com.ip.utilitylibrary;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.ip.utilitylibrary.*;


public class ExcelUtility {
	
	ConfigReader config=new ConfigReader();
	String filepath = config.GetConfigFilePath();
	
	public void ReadTestData(String sheetname,int rowno,int coulumnno)
	{
		try {
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row row = sh.getRow(rowno);
			String data = row.getCell(coulumnno).getStringCellValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void WriteTestData(String Sheetname, int rowno, int coulumnno,String inputdata)
	{
		try {
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(Sheetname);
			Row row = sh.getRow(rowno);
			Cell cell = row.createCell(coulumnno);
			cell.setCellValue(inputdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
