package TESTNGANNoTATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DataProviderExample2{
	public static WebDriver driver;
	public static Actions action;
	public  static WebDriverWait wait;
	public static WebDriver setup(String browserType,String appurl) {
		if(browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,20);
		action=new Actions(driver);
		driver.get(appurl);
		return driver;
	}
	
	@DataProvider
	public Object[][]getcred(){
		Object[][]obj=new Object[3][3];
		//1 st row
		obj[0][0]="chrome";
		obj[0][1]="admin";
		obj[0][2]="Test@123";
		
		//2nd row
		obj[1][0]="firefox";
		obj[1][1]="admin3";
		obj[1][2]="@123";
		
		//3rd row
		obj[2][0]=" ";
		obj[2][1]=" ";
		obj[2][2]=" ";
	return obj;
	}
//	@Test(dataProvider="getcred")
//	public void testDataprovider(String browser,String username,String password) {
//		System.out.println(browser);
//		System.out.println(username);
//		System.out.println(password);
//	}
	@Test(dataProvider="getcred")
	public void LoginInVtiger(String browserType,String username,String password) {
	WebDriver driver=setup(browserType,"https://demo.Vtiger.com/Vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
		driver.close();
	}
	
}
