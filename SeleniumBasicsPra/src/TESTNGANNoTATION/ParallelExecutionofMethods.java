package TESTNGANNoTATION;

import org.testng.annotations.Test;

public class ParallelExecutionofMethods {
@Test
public void testcaseone() {
	//printing Id of the thread on using which test method got executed
System.out.println("Test case one with Thread Id:-"+Thread.currentThread().getId());
}
@Test
public void testcaseTwo() {
	//printing Id of the thread on using which test method got executed
	System.out.println("Test case Two with Thread Id:-"+Thread.currentThread().getId());
}
}
