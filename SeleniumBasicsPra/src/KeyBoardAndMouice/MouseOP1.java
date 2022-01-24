package KeyBoardAndMouice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseOP1{
	public static void main(String[] args) {	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.espncricinfo.com/");
	Actions action=new Actions(driver);
//	create an instance of action class by passing driver instance to its constructor
	List<WebElement>menulist=driver.findElements(By.xpath("//ul[@class='nav nav-tabs league-tabs']//li"));
    int menulistcount=menulist.size();
    System.out.println(menulistcount);
    for(int i=0;i<menulistcount;i++) {
	System.out.println(menulist.get(i).getText());
	action.moveToElement(menulist.get(i)).perform();
	try {
		Thread.sleep(5000);
		}
	catch(InterruptedException e){
		e.printStackTrace();
	}

	 }
   }
}

