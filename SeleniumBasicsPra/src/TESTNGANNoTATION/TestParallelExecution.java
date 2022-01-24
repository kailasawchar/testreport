package TESTNGANNoTATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParallelExecution extends BaseUtil {
	public static WebDriver driver;
@BeforeMethod()
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
@Test
public void TestLoginOfVtiger() {
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
}
@Test
public void testLoginofActitime() {
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager",Keys.ENTER);

}
}
