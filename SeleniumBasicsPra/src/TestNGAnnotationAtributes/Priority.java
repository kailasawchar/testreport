package TestNGAnnotationAtributes;

import org.testng.annotations.Test;

public class Priority {
@Test
public void mango() {
	System.out.println("I am Mango");
}
@Test(priority=2)
public void apple() {
	System.out.println("I am Apple");
}
@Test(priority=1)
public void watermelon() {
	System.out.println("I am watermelon");
}
//here priority of mango() is (priority=0)..so that mango() will be run or execute first

}
