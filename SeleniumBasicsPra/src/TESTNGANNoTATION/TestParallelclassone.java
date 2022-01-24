package TESTNGANNoTATION;

import org.testng.annotations.Test;

public class TestParallelclassone {
@Test
public void testcaseOne() {
//printing class name and Id of the Thread on using which test method got executed
	System.out.println("Test case one in"+getClass().getSimpleName()+" with Thread Id:-"+Thread.currentThread().getId());
	}
@Test
public void testcaseTwo() {
	//printing class name and ID of the thread on using which test method got executed
	System.out.println("Test Case two in "+ getClass().getName() +" with Thread Id :-"+Thread.currentThread().getId());
}
}