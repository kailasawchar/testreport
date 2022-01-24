package TESTNGANNoTATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterization1 {
	@Parameters({ "browsername" })
	@Test
	public void browseropen(String browsername) {
		System.out.println("Browser name suggested as:" + browsername);
	}

	@Parameters({ "Signup" })
	@Test
	public void Signuptest(String Signup) {
		System.out.println("Signup is necessary:" + Signup);
	}

	@Parameters({ "username", "password" })
	@Test
	public void logininActitime( String username, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password, Keys.ENTER);
		

	}
}
