package SeleniumBasicsPra;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
//	implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement searchinputfield=driver.findElement(By.name("q"));
	searchinputfield.sendKeys("Selenium Testing");
//	to identify multiple web elements
//	List<WebElement>sugglist=driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li    "));
	List<WebElement>sugglist=driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li/div/div[2]/div[1]/span"));
//	ccsSelector use for this..
//	get the count of identify element
	int suggcount=sugglist.size();
	System.out.println(suggcount);
//	to access one by one list element
	for(int i=0;i<suggcount;i++) {
		System.out.println(sugglist.get(i).getText());
	}
//	close current browser
	driver.close();    
	
	}
}
/*10................output
selenium testing
selenium testing interview questions
selenium testing tutorial
selenium testing jobs in pune
selenium testing tool
selenium testing course in pune
selenium testing course
selenium testing jobs
selenium testing websites
selenium testing jobs in pune for freshers
*/