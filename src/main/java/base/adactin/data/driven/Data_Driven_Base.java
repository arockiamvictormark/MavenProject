package base.adactin.data.driven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Base {
	
	public static String login_data(int r,int c) throws Throwable {
		File f = new File(".\\DataDriven\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(r);
		Cell cell = row.getCell(c);
		CellType cellType = cell.getCellType();
		
		String cellValue = null;
		if (cellType.equals(CellType.STRING)) {
			cellValue = cell.getStringCellValue();
		} else if(cellType.equals(CellType.NUMERIC)) {
			double doubleValue = cell.getNumericCellValue();
			int intValue = (int) doubleValue;
			cellValue = String.valueOf(intValue);
		}
		
		wb.close();
		return cellValue;
	}

}
