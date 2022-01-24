package SeleniumBasicsPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmultiplepage {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement Samsungmenu=driver.findElement(By.xpath("//a[@href=\"samsung-phones-9.php\"]"));
	Samsungmenu.click();
	WebElement nextpage=driver.findElement(By.cssSelector("a[class=\"pages-next\"]"));
	System.out.println("nextpage is visible :"+nextpage.isDisplayed());
	System.out.println("nextpage is clickable :"+nextpage.isEnabled());
	//nextpage.click();
	List<WebElement>pagelist=driver.findElements(By.cssSelector(".nav-pages>a"));
	int pagelistcount=pagelist.size();
	System.out.println("Available pages :"+pagelistcount);
	
	}
	

}
