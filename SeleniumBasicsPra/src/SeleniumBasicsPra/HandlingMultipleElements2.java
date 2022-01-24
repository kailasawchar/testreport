package SeleniumBasicsPra;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");  
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.gsmarena.com/");
//driver.findElement(By.cssSelector(".brandmenu-v2>ul>li:nth-of-type(1)>a")).click();
driver.findElement(By.xpath("//a[text()='Samsung']")).click();
// to identify multiple web elements
List<WebElement>moblist=driver.findElements(By.xpath("//div[@class=\"makers\"]//ul//li//a//strong//span"));
//get the count of identify element
int mobilecount=moblist.size();
System.out.println(mobilecount);
// to access one by one list element
for(int i=0;i<mobilecount;i++) {
	System.out.println(moblist.get(i).getText());
}
	List<WebElement>linklist=driver.findElements(By.tagName("a"));
//	size of linklist
	int linkcount=linklist.size();
	System.out.println(linkcount);
	for(int j=0;j<linkcount;j++) {
		System.out.println(linklist.get(j).getText());
	}


//close current browser
//driver.close();

}
	}


