package SwitchFrameAlertCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class HandlinfAlerts extends Utils{

	static WebDriver driver;
	@Test(priority=0)
	public void testAlert() throws InterruptedException{
		driver=setup("chrome","https://demoqa.com/alerts");
//		//to open alert POPUP
//		driver.findElement(By.cssSelector("button[id='alertButton']")).click();
//		Thread.sleep(2000);
//        //switch your control to alert popup
//		String alertText=driver.switchTo().alert().getText();
//		System.out.println("Alert popup text:"+alertText);
//	//to accept alert or to click on ok or yes button use
//		driver.switchTo().alert().accept();
		//to open alert which open after '5' second popup
//		driver.findElement(By.id("timerAlertButton")).click();
//		String alertText1=driver.switchTo().alert().getText();
//		System.out.println("alertText1:"+alertText1);
//		driver.switchTo().alert().accept();
		//to open confirmation popup
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(2000);
//		//switch your control to confirmation popup
//		String confirmationpopupText=driver.switchTo().alert().getText();
//		System.out.println("confirmation popuptext:"+confirmationpopupText);
//		//to accept alert or to click on ok or yes button use
//		//driver.switchTo().alert().accept();
//		//to click on cancel or no button
//		driver.switchTo().alert().dismiss();
		
		//to open prompt popup
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		//switch your control to prompt popup
		String promptpopupText=driver.switchTo().alert().getText();
		System.out.println("promptpopup :"+promptpopupText);
//		type text in popup
		driver.switchTo().alert().sendKeys("selenium Testing");
		Thread.sleep(2000);
		//to accept alert or to click on ok or yesbutton use
		//driver.switchTo().alert().accept();
		//to click on cancel or no button
		//driver.switchTo().alert().dismiss();
	//	handleAlertPopup("accept");
		//Thread.sleep(2000);
	//	handleConfirmationPopup();
		//Thread.sleep(2000);
	//	handlePromptpopup();
	}
	@Test(priority=1)
	public void handlePromptpopup() {
	//to open prompt popup
		driver.findElement(By.id("promtButton")).click();
		//switch your control to prompt popup
		//String promptpopupText=driver.switchTo().alert().getText();
//		System.out.println("prompt popup text :"+promptpopupText);
		//or
		System.out.println(driver.switchTo().alert().getText());
		//type text in popup
		driver.switchTo().alert().sendKeys("selenium Testing");
		//to accept alert or to click on ok or yes button use
		driver.switchTo().alert().accept();
		//to click on cancel or no button
		//driver.switchTo().alert().dismiss();
	}
	@Test(priority=2)
		public void handleConfirmationPopup() {
		//to open confirmation popup
		driver.findElement(By.id("confirmButton")).click();
		//switch your control to confirmation popup
		String confirmationPopupText=driver.switchTo().alert().getText();
		System.out.println("confirmation popupText :"+confirmationPopupText);
		//to accept alert or to click on ok or yes button use
		driver.switchTo().alert().accept();
		//to click on cancel or no button
		//driver.switchTo().alert().dismiss();
	}
	@Test(priority=3)
		public void handleAlertPopup(String popupAction) {
		//to open alert popup
		driver.findElement(By.id("alertButton")).click();
		//switch your control to alert popup
		String alertText=driver.switchTo().alert().getText();
		System.out.println("Alert popup text :"+alertText);
		//to accept alert or to click on ok or yes button use
		if(popupAction.equals("accept")) {
			driver.switchTo().alert().accept();
		}
		else {
			driver.switchTo().alert().dismiss();
		}
		
	}
}		
		
		
		
		
		
		
		
		
		
		
		
			
	

