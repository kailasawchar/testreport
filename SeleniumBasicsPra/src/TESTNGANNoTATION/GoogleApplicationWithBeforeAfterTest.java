package TESTNGANNoTATION;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class GoogleApplicationWithBeforeAfterTest extends Utils{
	
WebDriver driver;
@BeforeTest
public void startup() {
	driver=setup("chrome","https://www.google.com/");
}
@Test
public void testGooglelandingPage() {
	String expectedTitle="Google";
	String actualTitle=driver.getTitle();
//	Assert.assertEquals(actualTitle, expectedTitle);
	Assert.assertEquals(actualTitle, expectedTitle,
			"Either google search page not opened or page title got changed");
	/* validation is pending*/
	System.out.println("Test Google Landing page is finished");
 }
@Test
public void testsearch() {
	WebElement searchinputfield=driver.findElement(By.name("q"));
	Assert.assertTrue(searchinputfield.isDisplayed());
   Assert.assertTrue(searchinputfield.isEnabled());
//   searchinputfield.sendKeys("SQL question",Keys.ENTER);
   driver.switchTo().activeElement().sendKeys("SQL question",Keys.ENTER);
   System.out.println(driver.getTitle());
   System.out.println("Test search is finished");
   }
@AfterTest
public void CleanUp() {
	driver.close();
	System.out.println("Cleanup is done");
}

}
