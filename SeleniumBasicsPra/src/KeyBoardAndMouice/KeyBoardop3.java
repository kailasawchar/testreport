package KeyBoardAndMouice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardop3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement createaccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createaccount.click();
		Actions action=new Actions(driver);
//		validate active element
//		String usernamefield=driver.switchTo().activeElement().getAttribute("type");
//		System.out.println(usernamefield.equals("text"));
		WebElement usernamefield=driver.findElement(By.name("firstname"));
		usernamefield.sendKeys("kailas");
		action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("Awchar").sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2)).sendKeys("9766794600")
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
		.sendKeys("kp").build().perform();
		WebElement dateday=driver.findElement(By.xpath("//select[@title=\"Day\"]/option[15]"));
		dateday.click();
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]/option[5]"));
		month.click();
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]/option[@value=\"1994\"]"));
		year.click();
		WebElement genmale=driver.findElement(By.xpath("//label[text()='Male']"));
		
		genmale.click();
		
		
		
		
		
		
		
	}

}
