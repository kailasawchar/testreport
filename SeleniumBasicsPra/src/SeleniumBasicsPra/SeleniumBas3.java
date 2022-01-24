package SeleniumBasicsPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBas3 {
	
	public static void main(String[] args) throws InterruptedException {
//		set path for Chrome driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\software\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\testing\\SeleniumBasicsPra\\executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
//	implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver can wait for the element from 0-30sec
	WebElement userinputfield=driver.findElement(By.id("txtUsername"));
	userinputfield.sendKeys("Admin");
	WebElement passwordinputfield=driver.findElement(By.id("txtPassword"));
	passwordinputfield.sendKeys("admin123");
	WebElement loginbtn=driver.findElement(By.id("btnLogin"));
    loginbtn.click();
   /* WebElement forgotpassword=driver.findElement(By.linkText("Forgot your password?"));
    forgotpassword.click();
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    WebElement username=driver.findElement(By.id("securityAuthentication_userName"));
    username.sendKeys("Admin");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    WebElement resetpasswordbtn=driver.findElement(By.id("btnSearchValues"));
    resetpasswordbtn.click();
//    implicit wait
   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    WebElement cancelbtn=driver.findElement(By.id("btnCancel"));
    cancelbtn.click();*/
//    explicit wait
    Thread.sleep(2000);
//    close current browser
    driver.close();
	}
}
