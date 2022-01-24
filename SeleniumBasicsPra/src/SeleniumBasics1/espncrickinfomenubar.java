package SeleniumBasics1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class espncrickinfomenubar {
public static void main(String[] args) {	
	    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		List<WebElement>menulist=driver.findElements(By.xpath("//ul[@class='nav nav-tabs league-tabs']//li"));
        int menulistcount=menulist.size();
        System.out.println(menulistcount);
        for(int i=0;i<menulistcount;i++) {
        	System.out.println(menulist.get(i).getText());
        }
}
}

