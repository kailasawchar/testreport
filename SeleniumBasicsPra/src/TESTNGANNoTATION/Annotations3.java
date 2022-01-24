package TESTNGANNoTATION;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	@BeforeMethod
	public void login() {
		System.out.println("open browser and login into application");
	}
@Test(priority=1)
public void taskcreation() {
	System.out.println("create a new task");
}
@Test(priority=2)
public void taskdelete() {
	System.out.println("Delete new task");
}
@AfterMethod
public void logout() {
	System.out.println("logout and close Browser");
}
}
