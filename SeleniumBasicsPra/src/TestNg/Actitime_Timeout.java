package TestNg;

import org.testng.annotations.Test;

public class Actitime_Timeout {
@Test(enabled=true,timeOut=200)//to failing test we use timeOunt
public void openBrowserandAppurl()throws InterruptedException{
	//Thread.sleep(100);
	Thread.sleep(210);
	System.out.println("open browser and enter app url");
}
}