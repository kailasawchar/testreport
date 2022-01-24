package TESTNGANNoTATION;



import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.BaseUtil;

public class DataproviderExample3 extends  BaseUtil{
//@DataProvider(name="testData")
@DataProvider
public Object[][]googlesearch(){
	Object[][]data=new Object[3][3];
	//1st row
	data[0][0]="chrome";
	data[0][1]="https://www.google.co.in/";
	data[0][2]="Selenium";
	
	data[1][0]="chrome";
	data[1][1]="https://www.google.co.in/";
	data[1][2]="SQL";
	
	data[2][0]="chrome";
	data[2][1]="https://demo.actitime.com/";
	data[2][2]=" ";
	return data;
}

@Test(dataProvider="googlesearch")
public void getda(String browserType,String appUrl,String userinfield ) {
	setUp(browserType,appUrl);
	driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys(userinfield );
}
}
