package KeyBoardAndMouice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		}
		catch(NoSuchElementException e){
			
		}
		List<WebElement>mainmenu=driver.findElements(By.xpath("//div[@class=\"_37M3Pb\"]/div/a/div[2]"));
		
		Actions action=new Actions(driver);
		
		for(int i=0;i<mainmenu.size();i++) {
			System.out.println("****"+mainmenu.get(i).getText()+"****");
			action.moveToElement(mainmenu.get(i)).perform();
			Thread.sleep(2000);
			List<WebElement>submenu=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
			System.out.println(submenu.size());
			if(submenu.size()>0) {
				for(int j=0;j<submenu.size();j++) {
					action.moveToElement(submenu.get(j)).perform();
//					driver.findElement(By.xpath("/a[text()='men'sJeans;]")).click();
					Thread.sleep(3000);
//					break;
				}
			}
		
		
		}
	}

}
