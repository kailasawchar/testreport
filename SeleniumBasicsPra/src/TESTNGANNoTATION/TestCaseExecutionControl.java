package TESTNGANNoTATION;

import org.testng.annotations.Test;

public class TestCaseExecutionControl {
@Test(priority=1,enabled=true)
public void testcaseLogin() {
	System.out.println("testcaseLogin is executed successfully");
}
@Test//If priority is not specified then the default priority will be 0..
public void testcasesignup() {
	System.out.println("testcasesignup is executed successfully");
}
@Test(enabled=false)//skip the test
public void testcaseDeletion() {
	System.out.println("testcaseDeletion is executed successfully");
}
@Test(priority=3,enabled=true)
public void testcaseCreation() {
	System.out.println("testcaseCreation is executed successfully");
}
}
