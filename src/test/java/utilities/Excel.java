package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getValue(String excelPath, String sheetName, int rowNum, int celNum){

		String value;
//		System.out.println("inside getValue()");
		FileInputStream fis;
		try {
			fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			value =	sheet.getRow(rowNum).getCell(celNum).getStringCellValue();
		} catch (Exception e) {
			value="";
		}

//		System.out.println("sheetName "+sheetName);
//		System.out.println("rowNum "+rowNum);
//		System.out.println("celNum" +celNum);

		return value;
	}

	public static int getTotalRow(String excelPath, String sheetName) {
		int rowCount;
//		System.out.println("inside getTotalRow()");
		try {
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sheet= wb.getSheet(sheetName);
			rowCount=sheet.getLastRowNum();
		} catch (Exception e) {
			rowCount=-1;
		}

		return rowCount;
	}


}
