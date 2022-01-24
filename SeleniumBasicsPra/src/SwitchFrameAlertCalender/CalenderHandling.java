package SwitchFrameAlertCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class CalenderHandling extends Utils {
static WebDriver driver;
@Test
public void testAlerts() throws InterruptedException {
	driver=setup("chrome","https://www.makemytrip.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("li[data-cy=\"account\"]")).click();
	Thread.sleep(2000);
	// to open calender
	WebElement depature=driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
	depature.click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//	Thread.sleep(2000);
//	//to select date from calender
//	driver.findElement(By.cssSelector("div[aria-label=\"Tue Feb 08 2022\"]")).click();
	driver.findElement(By.cssSelector("div[aria-label=\"Thu Jan 20 2022\"]")).click();
}
}
