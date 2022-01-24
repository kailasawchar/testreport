package SeleniumBasicsPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBas1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\testing\\SeleniumBasicsPra\\executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("Current URL is :"+driver.getCurrentUrl());
	int currenturllength=driver.getCurrentUrl().length();
	System.out.println("Current URL length :"+currenturllength);
	String webpagetitle=driver.getTitle();
	System.out.println("WebPageTitle : "+webpagetitle);
	int webpagetitlelength=webpagetitle.length();
	System.out.println("webpagetitle length :"+webpagetitlelength);
	String sourcecode=driver.getPageSource();
	//System.out.println("Source code is :"+sourcecode);
	int sourcecodelength=driver.getPageSource().length();
	System.out.println("Page source length :"+sourcecodelength);
	WebElement userinputfield=driver.findElement(By.name("txtUsername"));
	userinputfield.sendKeys("Admin");
	WebElement passwordfield=driver.findElement(By.name("txtPassword"));
	passwordfield.sendKeys("admin123");
	WebElement loginnow=driver.findElement(By.id("btnLogin"));
	loginnow.click();
	System.out.println("Login successfull....");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.close();
	}

}
