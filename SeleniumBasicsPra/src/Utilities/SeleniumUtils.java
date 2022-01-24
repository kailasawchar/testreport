package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtils {
public static WebDriver driver;
public static Actions action;
public static WebDriverWait wait;
public WebDriver setUp(String browser,String appurl) {
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.chromedriver().setup();
		driver=new FirefoxDriver();
	}else if(browser.equalsIgnoreCase("ie")) {
		WebDriverManager.chromedriver().setup();
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(appurl);
	action=new Actions(driver);
	wait=new WebDriverWait(driver,20);
	return driver;
	}
public void mouseHover(String hoverop,WebElement element,Integer x,Integer y) {
	Actions action=new Actions(driver);
	if(hoverop.equalsIgnoreCase("target")) {
		action.moveToElement(element).perform();
		}else if(hoverop.equalsIgnoreCase("targetwithcords")){
			action.moveToElement(element, x, y).perform();
		}else {
			action.moveByOffset(x, y).perform();
		}
}

public void getscreenShot(String filename) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File(filename));
	}catch(IOException e) {
		e.getStackTrace();
	}
}
public void performMouseOperation(WebElement element) {
	action.moveToElement(element).perform();
}
public void performRightClickOperation(WebElement element) {
	action.moveToElement(element).contextClick().build().perform();
}
public void DragAndDrop(WebElement source,WebElement target) {
	action.dragAndDrop(source, target).build().perform();
}
public void Cleanup() {
	driver.close();
}
}

	
	
	
	
	
	
	