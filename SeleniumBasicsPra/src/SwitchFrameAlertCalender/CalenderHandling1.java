package SwitchFrameAlertCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class CalenderHandling1 extends Utils {
static WebDriver driver;
@Test
public void Redbusbooking() throws InterruptedException {
	driver=setup("chrome","https://www.redbus.in/");
	driver.findElement(By.cssSelector("input[id=\"src\"]")).clear();
	driver.findElement(By.cssSelector("input[id=\"src\"]")).sendKeys("Parbhani");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[data-message=\"Please enter a destination city\"]")).clear();
	driver.findElement(By.cssSelector("input[data-message=\"Please enter a destination city\"]")).sendKeys("Pune");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[class=\"fl search-box date-box gtm-onwardCalendar\"]")).click();
	driver.findElement(By.cssSelector("table[class=\"rb-monthTable first last\"]>tbody>tr:nth-of-type(5)>td:nth-of-type(4)")).click();
Thread.sleep(2000);
driver.findElement(By.id("search_btn")).click();
driver.findElement(By.cssSelector("label[for=\"bt_SLEEPER\"]")).click();
driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
}
}