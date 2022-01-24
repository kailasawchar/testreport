package TESTNGANNoTATION;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.BaseUtil;


public class DataProviderExample extends BaseUtil {
	/*
	 * This test Method declares that its data should be supplied
	 * by the DataProvider "getdata" is the fuction name which is
	 * passing the data Number of columns should match the no of input parameters
	 */
//	@Test(dataProvider="getData")
//	public void setData(String user,String password) {
//		System.out.println("you have provided username as:-"+user);
//		System.out.println("you have provided password as:-"+password);
//	}
	@DataProvider
	public Object[][]getData(){
		/*
		 * Rows-Number of times your test has to be repeated
		 * Columns-Number of parameters in test data
		 */
		Object[][]data=new Object[3][2];
		//1st row
		data[0][0]="admin";
		data[0][1]="admin";
		
		//2nd row
		data[1][0]=" ";
		data[1][1]=" ";
		
		//3rd row
		data[2][0]="guestuser3";
		data[2][1]="pass123";
		return data;
	}
@Test(dataProvider="testData")
public void testLoginofVtiger(String browserType,String username,String password) {
	setUp(browserType,"https://demo.actitime.com/");
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys(username);
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password,Keys.ENTER);
	//driver.findElement(By.cssSelector("div[id='closeProjectLightBoxBtn']")).click();
}
@DataProvider(name="testData")
public Object[][]getuserDetails(){
	/*
	 * Rows-Number of times your test has to be repeated
	 * Columns-Number of parameters in test Data
	 */
	Object[][]data=new Object[3][3];
	//1st row
	data[0][0]="chrome";
	data[0][1]="admin";
	data[0][2]="manager";
	
	//2nd row
	data[1][0]="chrome";
	data[1][1]="trainee";
	data[1][2]="trainee";
	
	//3rd row
	data[2][0]="chrome";
	data[2][1]=" ";
	data[2][2]=" ";
	
	return data;
    }
}	
	
	
	
	
	
	
	
