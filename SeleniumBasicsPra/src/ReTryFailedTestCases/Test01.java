package ReTryFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01 {
@Test(retryAnalyzer=ReTryFailedTestCases.RetryAnalyzer.class)
public void Test1() {
	Assert.assertEquals(false, true);
}
@Test
public void Test2() {
	Assert.assertEquals(false, true);
}
}
