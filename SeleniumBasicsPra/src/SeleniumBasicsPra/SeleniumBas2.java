package SeleniumBasicsPra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBas2 {

	public static void main(String[] args) {
//	set path for executables driver
    System.setProperty("webdriver.chrome.driver","C:\\software\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\testing\\SeleniumBasicsPra\\executables\\chromedriver.exe");
//  System.setProperty("webdriver.chrome.driver", "./SeleniumBasicsPra/executables/chromedriver.exe");
//		String chromedriverpath=System.getProperty("user.dir") + "/.executables/chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		//		create an instance of ChromeDriver class and upcast to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String titlename=driver.getTitle();
		System.out.println("Title name is :"+titlename);
		String currenturl=driver.getCurrentUrl();
		System.out.println("current URL is :"+currenturl);
		String pagesourcecode=driver.getPageSource();
//		System.out.println("PageSourcecode is :"+pagesourcecode);
		int titlenamelength=titlename.length();
		System.out.println("Titlename length is :"+titlenamelength);
		
	}
}
