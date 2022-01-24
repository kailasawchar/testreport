package TESTNGANNoTATION;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class GoogleMethodWithBeforeAfterMethod extends Utils{
WebDriver driver;
@BeforeMethod
public void startup() {
	driver=setup("chrome","https://www.google.com");
}
@Test
public void testgoogleLandingpage() {
	String expectedTitle="Google";
	String actualTitle=driver.getTitle();
	System.out.println(expectedTitle.equals(actualTitle));
	/*validation is pending*/
}
@Test
public void testSearch() {
	driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	System.out.println(driver.getTitle());
}
@AfterMethod
public void CleanUp() {
	driver.close();
}

   

  }

