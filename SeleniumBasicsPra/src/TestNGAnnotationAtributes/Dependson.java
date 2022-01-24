package TestNGAnnotationAtributes;

import org.testng.annotations.Test;

public class Dependson {
@Test
public void WebstudentLogin() {
	System.out.println("student login through web");
}
@Test
public void mobilestudentlogin() {
	System.out.println("student login through mobile");
}
@Test(dependsOnMethods="WebstudentLogin")
public void APIstudentLogin() {
	System.out.println("student login through API");
}
}
