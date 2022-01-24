package SeleniumBasicsPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
//		1.Identify the dropdown list and store it into WebElement
		WebElement dropdownlist=driver.findElement(By.name("cars"));
//		2.create an instance of select class(predefined class in selenium) and pass dropdownlist WebElement
//		as a parameter in its constructor
        Select s1=new Select(dropdownlist);
        System.out.println(" Is it multiselect dropdownlist :"+s1.isMultiple());
//        op1:count the options present in dropdown
        List<WebElement>options=s1.getOptions();
        System.out.println("options count :"+options.size());
//        op2:print all the option name
        for(int i=0;i<options.size();i++) {
        	System.out.println(options.get(i).getText());
        }
//        op3:select required value from dropdown
        s1.selectByVisibleText("Volvo");//or
       s1.selectByValue("opel");//or
        s1.selectByIndex(3);
//       op4:get only selected options
        List<WebElement>selectedoption=s1.getAllSelectedOptions();
        System.out.println(selectedoption.size());
        for(int j=0;j<selectedoption.size();j++) {
        	System.out.println(selectedoption.get(j).getText());
      }
//   op5:unselecting the selected option
      s1.deselectByVisibleText("Volvo");
      s1.deselectByValue("opel");
      s1.deselectByIndex(3);
//      close current instance of browser
     // driver.close();
      }

}
	
