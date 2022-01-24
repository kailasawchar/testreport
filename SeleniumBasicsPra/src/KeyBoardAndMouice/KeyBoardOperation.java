package KeyBoardAndMouice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardOperation {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://crmaccess.vtiger.com/log-in/");
//	Identify username field 
	WebElement username=driver.findElement(By.cssSelector("input[name='username']"));
	username.sendKeys("Admin");
	username.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
//	Identify password field & paste value
	WebElement password=driver.findElement(By.cssSelector("input[name='password']"));
	password.sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
	
}
}
