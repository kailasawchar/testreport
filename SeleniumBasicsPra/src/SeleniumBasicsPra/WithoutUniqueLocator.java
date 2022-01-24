package SeleniumBasicsPra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUniqueLocator {
	public static void main(String[] args) {
//		String chromedriverpath=System.getProperty("user.dir"+"C:\\software\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\testing\\SeleniumBasicsPra\\executables\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "chromedriverpath");
		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstinputfield=driver.findElement(By.tagName("input"));
		firstinputfield.sendKeys("Kailas");
//		lastname will be types in first name field as selenium is not able to identify it uniquely 
		WebElement lastnameinputfield=driver.findElement(By.tagName("input"));
		lastnameinputfield.sendKeys("Awchar");
		
		
	}
	

}
