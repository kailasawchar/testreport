package TestNGAnnotationAtributes;

import org.testng.annotations.Test;

public class Description {
@Test (description="This is testcase1")
public void testcase1() {
	System.out.println("HR");
}
@Test (description="This is testcase2")
public void testcase2() {
	System.out.println("software developer");
}
@Test(description="job of rana")
public void workhard() {
	System.out.println("rana do hard work");
}
}
