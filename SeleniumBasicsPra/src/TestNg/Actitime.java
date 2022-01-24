package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class Actitime extends Utils{
	static WebDriver driver;
	@Test
	public void a_openBrowserandappurl() {
		driver=setup("chrome","https://demo.actitime.com/login.do");
		System.out.println("Browser opened and URL is also entered...");
	}
	@Test
	public void b_login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		System.out.println("username and password entered and login successfully...");
	}
	@Test
	public void c_createTask() {
		System.out.println("Task is created successfully...");
	}
	@Test
	public void d_logoutclose() {
		System.out.println("Logout from application...");
	driver.close();
	}

}
