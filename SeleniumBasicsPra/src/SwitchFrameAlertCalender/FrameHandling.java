package SwitchFrameAlertCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class FrameHandling extends Utils {
	static WebDriver driver;

	@Test(priority=0)
	public void openbrowserandhiturl()
	{
		driver=setup("chrome","https://jqueryui.com/draggable/");
	}
	@Test(priority=1)
	public void identifyframebyindex() {
		driver.switchTo().frame(0);
	}
//	@Test(priority=2)
//	public void identifyframebyWebElement()
//	{
//		WebElement frameobject=driver.findElement(By.cssSelector("demo-frame"));
////		switch to frame using webElement
//		driver.switchTo().frame(frameobject);
//	}
	@Test(priority=3)
	public void draganddrop()
	{
		Actions action=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		action.dragAndDropBy(drag, 100, 150).build().perform();
		}
@Test(priority=4)
public void swcitchtobacktomainpage() {
	driver.switchTo().defaultContent();
	driver.findElement(By.cssSelector(".logo"));
	
}
}
