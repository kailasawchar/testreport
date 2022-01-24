package SwitchFrameAlertCalender;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class Handlingframe extends Utils{
	  static WebDriver driver;
	@Test(priority=0)
	public void frame() {
		driver=setup("chrome","https://jqueryui.com/draggable/");
	}
@Test(priority=1)
public void switchtoframe() {
	WebElement menu=driver.findElement(By.xpath("//a[text()='Menu']"));
	menu.click();
	driver.switchTo().frame(0);
	WebElement electronic=driver.findElement(By.xpath("//div[text()=\"Electronics\"]"));
	 electronic.click();
	 driver.switchTo().defaultContent();
	 }
@Test(priority=2)
public void draganddrop() {
	WebElement draggable=driver.findElement(By.xpath("//a[text()='Draggable']"));
	draggable.click();
	WebElement droppable=driver.findElement(By.xpath("//a[text()='Droppable']"));
	droppable.click();
	driver.switchTo().frame(0);
	WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	WebElement drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	Actions action=new Actions(driver);
	action.dragAndDrop(drag, drop).build().perform();
	driver.switchTo().defaultContent();
	WebElement sortable=driver.findElement(By.xpath("//a[text()='Sortable']"));
	sortable.click();
    }
//@Test(priority=3)
//public void sortable() {
//	List<WebElement>list=driver.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
//	WebElement Item1=driver.findElement(By.xpath("//li[text()='Item 1']"));
//	WebElement Item2=driver.findElement(By.xpath("//li[text()='Item 2']"));
//	WebElement Item3=driver.findElement(By.xpath("//li[text()='Item 3']"));
//	WebElement Item4=driver.findElement(By.xpath("//li[text()='Item 4']"));
//	WebElement Item5=driver.findElement(By.xpath("//li[text()='Item 5']"));
//	WebElement Item6=driver.findElement(By.xpath("//li[text()='Item 6']"));
//	WebElement Item7=driver.findElement(By.xpath("//li[text()='Item 7']"));
//	Actions action=new Actions(driver);
//	
//	
//	}
}










