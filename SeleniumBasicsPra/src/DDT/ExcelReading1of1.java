package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading1of1 {
	@Test
	public void getSheetName() throws FileNotFoundException, IOException {
		// 1.file location
		FileInputStream fis = new FileInputStream("./testdata/Appdata.xlsx");
		// 2.Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3. perform operation on sheet
		int sheetcount = workbook.getNumberOfSheets();
		// give you sheet count present inside excel
		System.out.println("sheet count:" + sheetcount);
		System.out.println("Active sheet index:" + workbook.getActiveSheetIndex());
		for (int i = 0; i < sheetcount; i++) {
			System.out.println(workbook.getSheetName(i));
		}
		// to get specific sheet
		XSSFSheet sheet = workbook.getSheet("LoginDetails");
		System.out.println(sheet);
	}

	@Test
	public void getRowOperation() throws IOException {
		// 1.file location
		FileInputStream fis = new FileInputStream("./testdata/Appdata.xlsx");
		// 2.Create an instance of required workbook
		XSSFWorkbook x = new XSSFWorkbook(fis);
		// 3.get sheet
		XSSFSheet sheet = x.getSheet("LoginDetails");// introduce sheet name
		// 4.get row
		int rowcount = sheet.getLastRowNum();
		// in current how many rows are present rowcount=actualcount-1
		System.out.println("Rowcount:" + rowcount);
		// get specific index
		XSSFRow row = sheet.getRow(0);
	}

	@Test
	public void getcellOperation() throws IOException {
		// 1.file location
		FileInputStream fis = new FileInputStream("./testdata/Appdata.xlsx");
		// 2.Create an instance of required workbook
		XSSFWorkbook x = new XSSFWorkbook(fis);
		// 3.get sheet
		XSSFSheet sheet = x.getSheet("LoginDetails");
		// 4.get row
		XSSFRow row = sheet.getRow(0);
		// 5.cell operation
		XSSFCell cell = row.getCell(0);
		System.out.println("cell count in row-0:" + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
			System.out.print(row.getCell(i).getStringCellValue() + "\t");
		}
	}

	@Test
	public void getDifferentcellValues() throws IOException {
		// 1.file location
		FileInputStream fis = new FileInputStream("./testdata/Appdata.xlsx");
		// 2.Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3.get sheet
		XSSFSheet sheet = workbook.getSheet("LoginDetails");
		// 4.get row
		XSSFRow row = sheet.getRow(2);
		// 5.get cell operation
		System.out.println("cell count in row-2:" + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
			XSSFCell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println((int) cell.getNumericCellValue());
				break;
			case BLANK:
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			default:
				throw new RuntimeException("There is no support for this type of cell");
			}
		}
	}

	@Test
	public void getDifferentcellvalues_2() throws IOException {
		// 1.file location
		FileInputStream fis = new FileInputStream("./testdata/Appdata.xlsx");
		// 2.Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3.get sheet
		XSSFSheet sheet = workbook.getSheet("LoginDetails");
		// 4.get row
		XSSFRow row = sheet.getRow(1);
		// 5.cell operation
		System.out.println("cell count row-1:" + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
			XSSFCell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println((int) cell.getNumericCellValue());
				break;
			case BLANK:
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			default:
				throw new RuntimeException("There is no support for this type of cell");
			}
		}
	}

}