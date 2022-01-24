package TESTNGANNoTATION;

import org.testng.annotations.Test;

public class GroupExample {
@Test(groups="Regration")
public void testcaseone() {
	System.out.println("I am in testcaseone And in Regression Group");
}
@Test(groups="Regration")
public void testcasetwo() {
	System.out.println("I am in testcasetwo And in Regration Group");
}
@Test(groups="Smoke")
public void testcasethree() {
	System.out.println("I am in testcasethree And in SmokeTest Group");
}
@Test(groups="Regration")
public void testcasefour() {
	System.out.println("I am in testcasefour And in Regration Group");
}
@Test(groups="Smoke")
public void testcasefive() {
	System.out.println("I am in testcasefive And in SmokeTest Group");
}


}
