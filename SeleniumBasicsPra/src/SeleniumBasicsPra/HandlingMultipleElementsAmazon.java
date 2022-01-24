package SeleniumBasicsPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElementsAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		to identify multiple web elements
		List<WebElement>menuBarlist=driver.findElements(By.cssSelector("#nav-xshop>a"));
//		List<WebElement>menuBarlist=driver.findElements(By.cssSelector("#nav-xshop-container"));
//		get the count of identify elements
		int menuBarcount=menuBarlist.size();
		System.out.println(menuBarcount);
//		to access one by one list element
		for(int i=0;i<menuBarcount;i++) {
			if(!menuBarlist.get(i).getText().isEmpty()) {
		System.out.println(menuBarlist.get(i).getText());
		Thread.sleep(1000);
		}
			else {
				System.out.println("Empty :"+i);
				Thread.sleep(1000);
			}
		}
		
//close the current browser
//		driver.Close();

	}

}
