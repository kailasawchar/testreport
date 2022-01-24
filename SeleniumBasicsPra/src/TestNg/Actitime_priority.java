package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class Actitime_priority extends Utils{
	static WebDriver driver;
	@Test(priority=0,description="open browser method")
	public void openBrowserandAppurl() {
		driver=setup("chrome","https://demo.actitime.com/Login.do");
	//	System.out.println("Browser opened and URL is aslo entered..");
	}
	@Test (priority=1,description="I am login method")
	public void Login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
//		System.out.println("username and passoword entered and login successfully");
	}
	@Test (priority=2,description="I am creating new tassk")
	public void CreateTask() {
		
	}
	@Test (priority=3,description="logout and close browser")
	public void logoutclose() {
		System.out.println("logout from application...");
	driver.close();
	}
	
}
