package SwitchFrameAlertCalender;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class WindowHandling extends Utils{
	static WebDriver driver;
	@Test
	public void windowhandling() throws InterruptedException {
		driver=setup("chrome","https://demoqa.com/browser-windows");
		System.out.println("Home window current URL :"+driver.getCurrentUrl());
		//to get current window id
		String homewindoid=driver.getWindowHandle();
		System.out.println(" Home windo id :"+homewindoid);
//		click on button to open new tab/window
		driver.findElement(By.id("windowButton")).click();
		//get the window ids of all the browser window open by WebDriver
		Set<String>allwinids=driver.getWindowHandles();
		System.out.println("All win ids :"+allwinids);
		
		//get child window id
		allwinids.remove(homewindoid);
		System.out.println("all win ids after removing homewinid:"+allwinids);
		//get child window String id from allwinid
		Iterator<String>itr=allwinids.iterator();
//		String childwinid=itr.next();
		//or
		String childwinid=allwinids.iterator().next();
		System.out.println("childwinid :"+childwinid);
		//after getting required/child window id switch control to that window
		driver.switchTo().window(childwinid);
		System.out.println("aftre opening new tab/window,current URL :"+driver.getCurrentUrl());
		
		//close child window in which driver has focus 
		driver.close();
		//once all the child page operation are done come back to main page
		driver.switchTo().window(homewindoid);
		System.out.println("After coming back to main page, current URL :"+driver.getCurrentUrl());
		driver.close();
		//to close all the driver instance
		//driver.quit();
		}
}
