package TestNGAnnotationAtributes;

import org.testng.annotations.Test;

public class dependsOnMethodsgroups {
@Test(dependsOnMethods= {"testcase2","testcase3"})
public void testcase1() {
	System.out.println("This is testcase1");
}
@Test
public void testcase2() {
	System.out.println("This is testcase2");
}
@Test(invocationCount=4)
public void testcase3() {
	System.out.println("This is testcase3");
}
	
}
