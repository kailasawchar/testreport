package TESTNGANNoTATION;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeTest
	public void setup() {
		System.out.println("open browser and login into application");
	}
@Test(priority=1)
public void taskcreation() {
	System.out.println("create new task");
}
@Test(priority=2)
public void deleteTask() {
	System.out.println("Delete new task");
}
@AfterTest
public void cleanup() {
	System.out.println("logout and close browser");
}
}
