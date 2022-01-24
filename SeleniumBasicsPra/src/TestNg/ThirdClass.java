package TestNg;

import org.testng.annotations.Test;

public class ThirdClass {

	@Test(priority=3)
	public void draft() {
		System.out.println("draft successfull");
	}
	@Test(priority=1)
	public void Login() {
		System.out.println("Login successfull");
	}
	@Test(priority=0)
	public void SignUp() {
		System.out.println("Signup Successfull");
	}
	@Test(priority=2)
	public void compose() {
		System.out.println("compose successfull");
	}
}
