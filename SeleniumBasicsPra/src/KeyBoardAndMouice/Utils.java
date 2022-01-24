package KeyBoardAndMouice;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
//	Reusable class
	static public WebDriver setup(String browserName,String appUrl) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(appUrl);
		return driver;
	}
	public static void mouseHover(String hoverOp,WebDriver driver,WebElement element,Integer x,Integer y) {
	Actions action=new Actions(driver);	
	if(hoverOp.equalsIgnoreCase("target")) {
		action.moveToElement(element).perform();
	}
	else if(hoverOp.equalsIgnoreCase("target with cords")) {
		action.moveToElement(element, x, y).perform();
	}
	else {
		action.moveByOffset(x, y).perform();
	  }
	}
}
	


