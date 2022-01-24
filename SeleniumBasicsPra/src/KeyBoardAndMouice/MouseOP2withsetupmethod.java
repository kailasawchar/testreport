package KeyBoardAndMouice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOP2withsetupmethod {
  static Actions action;
  static WebDriver driver;
  static void setup(String appurl) {
	  WebDriverManager.chromedriver().setup();
//	  create an object of chromedriver class and upcasting it to WebDriver interface
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  enter required application url
	  driver.get(appurl);
	  action=new Actions(driver);
  }
  static void performMouseOverOperation(WebElement element) {
	  action.moveToElement(element).perform();
  }
  static void performRightclickOperation(WebElement element) {
	  action.moveToElement(element).contextClick().build().perform();
  }
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
//	creating an object of Chromedriver class and upcasting it to WebDriver Interface
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//	Actions action=new Actions(driver);
//	WebElement freebooklink=driver.findElement(By.xpath("//a[text()='freeEbooks']"));
//	action.moveToElement(freebooklink).perform();
//	action.moveToElement(freebooklink, 100, 0).perform();
//	or
	setup("https://www.globalsqa.com/demo-site/");
	WebElement freebooklink=driver.findElement(By.xpath("//li[@id=\"menu-item-7128\"]//a"));
//	performMouseOverOperation(freeBooklink)
//	action.moveToElement(freebooklink).contextClick().build().perform();
//	or
//	performRightClickOperation(FreeBooklink);
	driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
	Thread.sleep(2000);
	WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
	driver.switchTo().frame(frame);
	WebElement source=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
	WebElement target=driver.findElement(By.cssSelector("div#trash"));
	}
//	performDragAndDrop(source,target);
	static void performDragAndDrop(WebElement source,WebElement target) {
		action.dragAndDrop(source, target).build().perform();
	}
	
	
	}

