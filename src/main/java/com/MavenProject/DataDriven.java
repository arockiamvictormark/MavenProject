package com.MavenProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws Throwable {

		File f = new File(".\\DataDriven\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetId = wb.getSheetAt(0);
		Row row = sheetId.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println("Cell Value(String): "+stringCellValue);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double doubleValue = cell.getNumericCellValue();
			int numericValue = (int) doubleValue;
			String numericCellValue = String.valueOf(numericValue);
			System.out.println("Cell Value(Numeric): "+numericCellValue);
		}
		
		wb.close();

	}

}
