package TestNg;

import org.testng.annotations.Test;

public class Actitime_Dependson {
	@Test(enabled = true)
	public void openBrowserandAppurl() {
		int i = 100 / 0;
		System.out.println("open browser and enter app url");
	}

	@Test(enabled = true, dependsOnMethods = "openBrowserandAppurl")
	public void login() {
		System.out.println("enter username,password and click on login button");
	}

	@Test(enabled = true)
	public void createtask() {
		System.out.println("create new Task");
	}

	@Test(enabled = true)
	public void logoutclose() {
		System.out.println("logout from the application and close the browser");
	}

}
