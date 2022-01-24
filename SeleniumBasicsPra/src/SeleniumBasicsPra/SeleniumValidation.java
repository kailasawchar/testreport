package SeleniumBasicsPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumValidation {
public static void main(String[] args)throws InterruptedException {
//	selenium validation
 System.setProperty("webdriver.gecko.driver","./executables/geckodriver.exe" );
WebDriver driver=new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");
//implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
System.out.println("WebPage Title :"+driver.getTitle());
System.out.println("Current URL is:"+driver.getCurrentUrl());
// identify userName field
WebElement usernamefield=driver.findElement(By.id("username"));
/*//Validation on username field
1.Visible or not-->isDisplayed()-->boolean
true-->visible,false-->not visible
2.editible or not-->isEnabled()-->boolean
true-->editible or clickable,false-->not editible
3.Get attribute value based on attribute name-->getAttribute(String arg)
  //boolean visibilityofusernamefield=usernamefield.isDisplayed();
*/
System.out.println("usernamefield visibility is "+usernamefield.isDisplayed());
System.out.println(" usernamefield is editible or not:"+usernamefield.isEnabled());
System.out.println("placeholder value of usernamefield : "+usernamefield.getAttribute("placeholder"));
usernamefield.sendKeys("admin");
//WebElement Passwordfield=driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input"));
//Passwordfield.sendKeys("manager");
WebElement Passwordfield=driver.findElement(By.name("pwd"));
/*System.out.println("Passwordfield visibility is "+Passwordfield.isDisplayed());
System.out.println(" Passwordfield is editible or not:"+Passwordfield.isEnabled());
System.out.println("placeholder value of Passwordfield : "+Passwordfield.getAttribute("placeholder"));*/
Passwordfield.sendKeys("manager");
WebElement loginbtn=driver.findElement(By.tagName("div"));
/*System.out.println("loginbtn visibility is "+loginbtn.isDisplayed());
System.out.println(" loginbtn is editible or not:"+loginbtn.isEnabled());*/
System.out.println("loginbtn name :"+loginbtn.getText());
loginbtn.click();
//identify Checkbox
WebElement checkbox=driver.findElement(By.id("keepLoggedInLabel"));
/*System.out.println("Checkbox visibility is "+checkbox.isDisplayed());
System.out.println("Checkbox is editible or not:"+checkbox.isEnabled());
System.out.println("Checkbox is selected or not:"+checkbox.isSelected());*/
checkbox.click();
//System.out.println("Checkbox is selected or not:"+checkbox.isSelected());
//close current browser
//driver.close();

 }
}
