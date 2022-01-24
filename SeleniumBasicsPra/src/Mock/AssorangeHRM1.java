package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class AssorangeHRM1 extends Utils {
	WebDriver driver;

	@Test(priority = 0)
	public void openbrowserAndhitthesite() throws InterruptedException {
		driver = setup("chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();

	}

	@Test(priority = 1)
	public void creattask() throws InterruptedException {
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		driver.findElement(By.xpath("//a[text()='Job']")).click();
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void createtask1() throws InterruptedException {
		driver.findElement(By.cssSelector("#jobTitle_jobTitle")).sendKeys("Vilas");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ohrmList_chkSelectRecord_29")).click();

		driver.findElement(By.id("btnDelete")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dialogDeleteBtn")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
