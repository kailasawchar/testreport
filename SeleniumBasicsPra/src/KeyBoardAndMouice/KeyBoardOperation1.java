package KeyBoardAndMouice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardOperation1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);

	}

}
