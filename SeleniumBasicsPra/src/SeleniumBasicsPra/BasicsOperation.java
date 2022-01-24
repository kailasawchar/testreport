package SeleniumBasicsPra;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOperation {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
//	maximize browser window
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().setSize(new Dimension(500,700));
	Thread.sleep(2000);
//		maximize browser window
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("WebPage Title is :"+driver.getTitle());
	System.out.println("Current Page URL is :"+driver.getCurrentUrl());
//	System.out.println("Current Page Source code:"+driver.getPageSource());
//	Click on Forgot your password?
	WebElement forgotlink=driver.findElement(By.linkText("Forgot your password?"));
	forgotlink.click();
//	or
//	driver.findElement(By.linkText("Forgot your password?")).click();
//	Navigation in browser
	Thread.sleep(2000);
//	go to previous page
	driver.navigate().back();
	Thread.sleep(2000);
//	next page
	driver.navigate().forward();
	Thread.sleep(2000);
//    reload or refresh current page
	driver.navigate().refresh();
	Thread.sleep(2000);
//	jump from current page to another page or URL
	driver.navigate().to("https://www.amazon.in/");
//	close current instance of browser
//	driver.close();
   }
}
