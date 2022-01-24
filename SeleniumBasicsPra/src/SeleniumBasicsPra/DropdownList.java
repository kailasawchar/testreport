package SeleniumBasicsPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownList {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	implicit Wait
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demosite.executeautomation.com/");
	WebElement inputfield=driver.findElement(By.cssSelector("input[name='UserName']"));
	inputfield.sendKeys("pride");
	WebElement password=driver.findElement(By.cssSelector("input[name=\"Password\"]"));
	password.sendKeys("pk");
	WebElement login=driver.findElement(By.cssSelector("input[name=\"Login\"]"));
	login.click();
//	identify dropdownlist and store it into WebElement
	WebElement dropdownlist=driver.findElement(By.id("TitleId"));
//	create an instance of Select class(predefined class in selenium) and pass
//	dropdown list WebElement as a parameter in its constructor
	Select s1=new Select(dropdownlist);
	System.out.println("is it multiselect dropdownlist :"+s1.isMultiple());
//	op1:count the options present in dropdown
	List<WebElement>options=s1.getOptions();
	int optionscount=options.size();
	System.out.println("options count :"+optionscount);
//	op2:print all the options name
	for(int i=0;i<optionscount;i++) {
		System.out.println(options.get(i).getText());
	}
//	op3:get already selected option
	String selectvalue=s1.getFirstSelectedOption().getText();
	System.out.println(selectvalue);
//	op4:select required value from dropdown
	s1.selectByVisibleText("Mr.");
//  s1.selectByValue("2");	
//	s1.selectByIndex(2);
//	System.out.println(s1.getFirstSelectedOption().getText());
//	close current instance of browser
//	driver.close();
	}

}
