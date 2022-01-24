package SeleniumBasicsPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementConcept {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.half.ebay.com");
//		1.get the total count of links on the page
//		2.get text of each link on the page
//		all the links are represented by <a>html tag:
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		int linklistcount=linklist.size();
		System.out.println(linklistcount);
//		for(int i=0;i<linklistcount;i++) {
//			System.out.println(linklist.get(i).getText());
//		}
	}

}
