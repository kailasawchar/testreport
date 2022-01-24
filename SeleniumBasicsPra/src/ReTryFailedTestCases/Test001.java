package ReTryFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
@Test
public void testcase1() {
	Assert.assertEquals(false, true);
}
@Test
public void testcase2() {
	Assert.assertEquals(false,true);
}
}
