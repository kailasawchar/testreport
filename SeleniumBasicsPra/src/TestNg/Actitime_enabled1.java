package TestNg;

import org.testng.annotations.Test;

public class Actitime_enabled1 {
@Test(enabled=true)
public void openBrowserAndAppURL() {
System.out.println("open browser and Enterapp URL");	
}
@Test(enabled=false)
public void login() {
	System.out.println("enter username,password and click on login button");
}
@Test(enabled=true)
public void createtask() {
	System.out.println("create new task");
	}
@Test(enabled=false)//For skipping purpose we use enabled=false
public void logoutclose() {
	System.out.println("logout from the application and close the browser");
}
@Test(invocationCount=5)//invocationCount=5,threadPoolSize=4
public void invocationcount() {
	System.out.println("Invocation count 5");
}
}
