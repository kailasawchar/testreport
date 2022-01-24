package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading1of2 {
@Test
public void getEachRowFirstCellValue() throws FileNotFoundException,IOException {
	//1.file location
	FileInputStream fis=new FileInputStream("./testdata/Appdata.xlsx");
	//2.create an instance of required workbook
	Workbook workbook=new XSSFWorkbook(fis);
	//3.get sheet
	Sheet sheet=workbook.getSheet("LoginDetails");
	//4.get row
	//Row row=sheet.getRow(0);
	int rowcount=sheet.getLastRowNum();
	System.out.println(rowcount);
	for(int i=0;i<=rowcount;i++) {
		//Row row=sheet.getRow(i);
		//Cell cell=row.getCell(i);
		System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
		}
   }
@Test
public void getEachRowAllCellValue() throws IOException {
	//1.file location
	FileInputStream fis=new FileInputStream("./testdata/Appdata.xlsx");
	//2.create an instance of required workboook
	Workbook workbook=new XSSFWorkbook(fis);
	//3.get sheet
	Sheet sheet=workbook.getSheet("LoginDetails");
	//4.get row count
	int rowcount=sheet.getLastRowNum();
	System.out.println(rowcount);
	for(int i=0;i<=rowcount;i++) {
	int cellcount=sheet.getRow(i).getLastCellNum();
	for(int j=0;j<cellcount;j++) {
//		System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+"t");
//	}
//	System.out.println();
		Cell cell=sheet.getRow(i).getCell(j);
		switch(cell.getCellType()) {
		case STRING:
			System.out.println(cell.getStringCellValue());
			break;
		case NUMERIC:
			System.out.println((int)cell.getNumericCellValue());
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
}
