package TestNg;

import org.testng.annotations.Test;

public class FirstNglass1 {
@Test
public void tastcase100() {
	System.out.println("test100 is running");
}
@Test
public void testcase101() {
	int res;
	try {
		res=100/0;
	}
	catch(Exception e) {
		
	}
}
@Test

public void testcase102() {
	int age=100/0;
	System.out.println("testcase102 is running");
}
}
