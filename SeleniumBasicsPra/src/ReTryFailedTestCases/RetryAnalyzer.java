package ReTryFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
int counter=0;
int retrylimit=2;
/*
 * (non Javadoc)
 * @see org.testng.TRetryAnalyzer#retry (org.testng.ITestResult)
 * This method decides how many times a test needs to be return
 * TestNg will call this method every time a test fails so we can put some code in here to 
 * decide when to return the test
 * Note:-This method will return true if a test needs to be retried and false it not
 */
@Override
public boolean retry(ITestResult result) {
	if(counter<retrylimit) {
		counter ++;
		return true;
	}
	return false;
}
}
