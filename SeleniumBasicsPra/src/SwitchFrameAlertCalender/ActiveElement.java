package SwitchFrameAlertCalender;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;


public class ActiveElement extends Utils{
static WebDriver driver;
@Test
public void testElements() {
	driver=setup("chrome","https://demo.actitime.com/login.do");
//	get the active element from the webpage
	WebElement element=driver.switchTo().activeElement();
	String act=element.getAttribute("placeholder");
//	verifying username field
	Assert.assertEquals(act,"Username","By default control is not in username field");
	element.sendKeys("admin",Keys.TAB);
	driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	
}
}
