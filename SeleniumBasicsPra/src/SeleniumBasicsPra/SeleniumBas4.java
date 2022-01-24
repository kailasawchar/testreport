package SeleniumBasicsPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBas4 {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	enter required application url
	driver.get("https://crmaccess.vtiger.com/log-in/");
//	implicit wait
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	String CurrentURL=driver.getCurrentUrl();
	System.out.println("CurrentURL is :"+CurrentURL);
	String WebpageTitle=driver.getTitle();
	System.out.println("Page title before login :"+WebpageTitle);
	int lengthofurl=CurrentURL.length();
	System.out.println("length of url:"+lengthofurl);
	int lengthofwebpagetitle=WebpageTitle.length();
	System.out.println("length of webpagetitle :"+lengthofwebpagetitle);
	String webpagesourcecode=driver.getPageSource();
	//System.out.println("web page source code :"+webpagesourcecode);
	int webpagesourcecodelength=webpagesourcecode.length();
	driver.manage().window().maximize();
	/*WebElement usernameinputfield=driver.findElement(By.name("username"));
	usernameinputfield.sendKeys("Kailasawchar1990@gmail.com");
	WebElement passwordfield=driver.findElement(By.cssSelector("input[placeholder='Password']"));
	passwordfield.sendKeys("Pooja");
	//WebElement signinbtn=driver.findElement(By.cssSelector("button[type='submit']"));
	//signinbtn.click(); 
*/	WebElement forgotpassword=driver.findElement(By.cssSelector("a[href='/password-reset/']"));
	Thread.sleep(2000);
	System.out.println("page title After login :"+driver.getTitle());
	}

}
