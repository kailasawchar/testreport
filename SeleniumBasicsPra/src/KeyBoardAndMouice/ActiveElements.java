package KeyBoardAndMouice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElements {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://crmaccess.vtiger.com/log-in/");
//	Validate active element
//	String usernamefield=driver.switchTo().activeElement().getAttribute("placeholder");
//	System.out.println(usernamefield.equals("username"));
//    driver.switchTo().activeElement().sendKeys("Admin",Keys.TAB);
      driver.switchTo().activeElement().sendKeys("Admin",Keys.chord(Keys.CONTROL,"a"),
  		Keys.chord(Keys.CONTROL,"c"),Keys.TAB);
      driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL,"v"));
      }
}
