package TESTNGANNoTATION;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class Parameterization extends Utils {
	@Parameters({ "browserName" })
	@Test
	public void testcaseone(String browserName) {
		System.out.println("browser passed as:-" + browserName);
	}

	@Parameters({ "username", "password" })
	@Test
	public void testcasetwo(String username, String password) {
		System.out.println("parameter for username passed as:-" + username);
		System.out.println("parametere for password passed as:-" + password);
	}

	@Parameters({ "browserName", "username", "password" })
	@Test
	public void testloginofActitime(String browserName, String username, String password) {
		WebDriver driver = setup(browserName, "https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password, Keys.ENTER);

	}
}
