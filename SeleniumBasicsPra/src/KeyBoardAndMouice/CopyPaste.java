package KeyBoardAndMouice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPaste {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		firstname.clear();
		lastname.clear();
		firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL,Keys.END);
		Thread.sleep(2000);
		
	}

}
