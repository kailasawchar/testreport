package TESTNGANNoTATION;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
/*
 * Behalf of all the@Test annotation method executes only once either in
 * the Starting or in the end of all the TCs
 */
	@BeforeTest
	public void setup() {
		System.out.println("open browser and login into application");
	}
	@Test
	public void taskcreation() {
		System.out.println("create new task");
	}
	@Test
	public void taskDeletion() {
		System.out.println("Delete new task");
	}
	@AfterTest
	public void Cleanup() {
		System.out.println("logout and close browser");
	}
}
