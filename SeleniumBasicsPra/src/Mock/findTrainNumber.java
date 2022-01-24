package Mock;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class findTrainNumber extends Utils {
static WebDriver driver;
@Test
public void trainnumber() {
	
	driver=setup("chrome","https://etrain.info/station/pune-Jn-PUNE/all");
	List<WebElement>TrainNumbers=driver.findElements(By.xpath("//table[contains(@class,'myTable')]//tr/td[1]/a"));
	System.out.println("List of Train:"+TrainNumbers.size());
//	for(WebElement element:TrainNumbers) {
//		System.out.println(element.getText());
//	}
	List<WebElement>TrainNames=driver.findElements(By.xpath("//table[contains(@class,'ta')]//tr/td[2]/a"));
for(WebElement element:TrainNames) {
	System.out.println(element.getText());
       }
    }
}
