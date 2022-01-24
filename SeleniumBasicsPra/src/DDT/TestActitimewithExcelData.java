package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestActitimewithExcelData {
String appurl,username,password,expectedTitle;
WebDriver driver;
public String readTestData(String FileName,String SheetName,int rowNum,int cellNum) 
throws FileNotFoundException,IOException{
	//1.File Location
	FileInputStream fis=new FileInputStream(FileName);
	//2.create an instance of required workbook
	XSSFWorkbook x=new XSSFWorkbook(fis);
	//3.get sheet
	Sheet sheet=x.getSheet(SheetName);
	//4.get row
	Row row=sheet.getRow(rowNum);
	//5.cell operation
	return row.getCell(cellNum).getStringCellValue();
}
@BeforeTest
public void getAppData() throws FileNotFoundException, IOException{
appurl=	readTestData(".\\testdata\\Appdata.xlsx","LoginDetails",1,0);
username=readTestData(".\\testdata\\Appdata.xlsx","LoginDetails",1,1);
password=readTestData(".\\testdata\\Appdata.xlsx","LoginDetails",1,2);
expectedTitle=readTestData(".\\testdata\\Appdata.xlsx","LoginDetails",1,3);
}
@BeforeMethod
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(appurl);
}
@Test
public void loginIntoActitimeAPP() throws Exception {
	driver.switchTo().activeElement().sendKeys(username,Keys.TAB);
	driver.switchTo().activeElement().sendKeys(password,Keys.ENTER);
	Thread.sleep(2000);
	//Assert.assertEquals(driver.getTitle().trim(),expectedTitle.trim(), "Either Actitime homepage title got changed or page is not loaded properly");
}
@Test
public void testPosition(){
	WebElement UrName=driver.findElement(By.name("username"));
	Point Urpoint=UrName.getLocation();
	int UrY=Urpoint.getY();
	int UrX=Urpoint.getX();
	System.out.println("username x and y cords:"+UrX+" "+UrY);
	WebElement pwd=driver.findElement(By.name("pwd"));
	Point pwdpoint=pwd.getLocation();
	int pwdY=pwdpoint.getY();
	int pwdX=pwdpoint.getX();
	System.out.println("password x and y cords :"+pwdX+" "+pwdY);
	System.out.println(UrY<pwdY);
	}
@AfterMethod
public void cleanup() { 
	driver.close();
    }
}

