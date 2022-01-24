package Mock;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import KeyBoardAndMouice.Utils;

public class TakeScreenShot1 extends Utils{
static WebDriver driver;
@Test
public void TakescreenshotforGoogle() throws IOException, InterruptedException {
	driver=setup("chrome","https://etrain.info/station/pune-Jn-PUNE/all");
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File("./SeleniumBasicsPra/ScreenShot"));
 }
}
