package SeleniumBasicsPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements1  {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement searchinputfield=driver.findElement(By.name("q"));
	searchinputfield.sendKeys("selenium");
//	to identify multiple web elements
	List<WebElement>sugglist=driver.findElements(By.cssSelector("ul[role='listbox']>li>div>div:nth-of-type(2)div:first child>span"));
//	get the count of identify element
	int suggcount=sugglist.size();
	System.out.println("suggcount");
//	to access one by  one list element
	for(int i=0;i<suggcount;i++) {
		System.out.println(sugglist.get(i).getText());
//		Close the current browser
//		driver.close();
	}
	
	
}
	
	}


