package SeleniumBasics1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumOrangeHRM {
public static void main(String[] args) throws InterruptedException {
//	step 1:set path for driver executables
//	System.setProperty("webdriver.chrome.driver", "C:\software\eclipse-jee-photon-R-win32-x86_64\eclipse\testing\SeleniumBasicsPra\executables\chromedriver.exe");
//    String chromedriverpath=System.getProperty("user.dir","./executables/chromedriver.exe");
//	System.setProperty("webdriver.chrome.driver", chromedriverpath);
      System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe")	;
	//  step 2: create an instance of chromedriver class
//	ChromeDriver cdriver=new ChromeDriver();
//	upcast into WebDriver Interface
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	driver.manage().window().maximize();
    String pageTitle=driver.getTitle();
    System.out.println("PageTitle is :"+pageTitle);
    int pageTitlelength=pageTitle.length();
    System.out.println("pageTitlelength :"+pageTitlelength);
    String currenturl=driver.getCurrentUrl();
    System.out.println("Current URL is :"+currenturl);
    int urllength=currenturl.length();
    String sourcecode=driver.getPageSource();
//    System.out.println("page sourcecode :"+sourcecode);
    int sourcecodelength=sourcecode.length();
    String expectedtitle="OrangeHRM";
    System.out.println("Title Matched :"+pageTitle.equals(expectedtitle));
    System.out.println("Source code Length :"+sourcecodelength);
//   close the driver
//    driver.close();
    
    
	
	
	
}
}
