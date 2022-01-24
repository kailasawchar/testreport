package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading1of3 {
@Test
public void updateResult() throws FileNotFoundException,IOException    {
	//1.file location(crate an instance of fileinputstream and pass the file 
	//location into constructor of fileinputstream
	FileInputStream fis=new FileInputStream("./testdata/Appdata.xlsx");
	//2.Create an instance of required workbook
	Workbook workbook=new XSSFWorkbook(fis);
	//3.get sheet
	Sheet sheet=workbook.getSheet("LoginDetails");
	//4.get row count
	int rowcount=sheet.getLastRowNum();
	for(int i=1;i<=rowcount;i++) {
		Row row=sheet.getRow(i);
		int cellcount=row.getLastCellNum();
		row.createCell(cellcount).setCellValue("Fail");
	}
	//To write the content into file use below steps
	/*
	 * 1.create an instance of FileOutputStream and call write()
	 * 2.before writing the contents into file make sure that file should closed
	 */
	FileOutputStream fos=new FileOutputStream("./testdata/Appdata.xlsx");
	workbook.write(fos);
	fos.flush();
	fos.close();
}
@Test
public void createNewExcelFile()throws FileNotFoundException,IOException{
	////1.create an instance of FileOutputStream
//	FileOutputStream fos=new FileOutputStream("./testdata/Appdata_new.xlsx");
//	//create an instance of required workbook
//	Workbook workbook=new XSSFWorkbook(); 
//	workbook.write(fos);
	//or
	//1.create an instance of FileOutputStream
//	FileOutputStream fos=new FileOutputStream("./testdata/Appdata_new2.xlsx");
	//or
	//create an instance of FileOutputStream
	FileOutputStream fos=new FileOutputStream("./testdata/Appdata_new3.xlsx");
	fos.close();
}
}
