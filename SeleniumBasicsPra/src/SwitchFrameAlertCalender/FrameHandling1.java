package SwitchFrameAlertCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class FrameHandling1 extends Utils {
	static WebDriver driver;
@Test
public void testelement() {
driver=setup("chrome","https://jqueryui.com/draggable/");
/*create an instance of action class*/
 Actions action=new Actions(driver);
 /*switch to required frame using index number*/
 driver.switchTo().frame(0);
// or
 /*identify the frame*/
// WebElement FrameObject=driver.findElement(By.cssSelector(".demo-frame"));
// /* switch to frame using WebElement*/
// driver.switchTo().frame("frameobject");
 WebElement drag=driver.findElement(By.cssSelector("div[id=\"draggable\"]"));
 /* Do drag and drop with offset values*/
 action.dragAndDropBy(drag, 100, 150).build().perform();
 /*switch back to the main page*/
 driver.switchTo().defaultContent();
 driver.findElement(By.className(".logo")).click();
}
}
