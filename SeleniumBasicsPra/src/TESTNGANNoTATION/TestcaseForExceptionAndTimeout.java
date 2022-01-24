package TESTNGANNoTATION;

import org.testng.annotations.Test;

public class TestcaseForExceptionAndTimeout {

//	@Test
//	public void DivideByZeroExample1() {
//		
//		try{
//			int i=1/0;
//		}catch(Exception e) {
//			
//		}
//		System.out.println("ArithmeticException handling done");
//	}
	//when you catch the exception at test case level
	@Test(expectedExceptions=ArithmeticException.class)
	public void DivideByZeroExample1() {
		System.out.println("Exception test");
		int i=1/0;
		System.out.println("Exception handling done");
	}
	@Test(timeOut=1000)//specify time in milliseconds
	public void executetimeout() throws InterruptedException{
		//Thread.sleep(2000);
		System.out.println("I am in executetimeout");
		Thread.sleep(500);
	}
	//when yoy catch the exception at test case level
	@Test(expectedExceptions=NullPointerException.class)
	public void stringputasnull() {
		System.out.println("I am in NullPointerException");
		String s=null;
		s.length();
	}
}
