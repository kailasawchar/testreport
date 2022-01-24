package TestNg;

import org.testng.annotations.Test;

public class SecondNgclass {

	@Test
	public void Login() {
		System.out.println("login successfull");
	}
	@Test
	public void draft() {
		System.out.println("draft successful");
	}
	@Test
	public void signUp() {
		System.out.println("signUp successful");
//	System.out.println("getRevese(newStringBuffer("Kailas"))"); 
	}
	StringBuffer getReverse(StringBuffer sb) {
		return sb.reverse();
	}
}
//Test are passes according to Alphabetical order
