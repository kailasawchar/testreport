package TESTNGANNoTATION;

import org.testng.annotations.Test;

public class SampleClass1 {
int age=25;
void display() {
	System.out.println("I am display");
}
@Test
public void testcase1() {
	System.out.println("I am test case1...");
	System.out.println("age :"+age);
	display();
}
}
