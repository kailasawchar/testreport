package TestNg;

import org.testng.annotations.Test;

public class SetTestcaseorderPriority {
  @Test(priority=2)
  public void testcaselogin() {
	  System.out.println("testcaselogin is executed successfully");
  }
  @Test(priority=1)
  public void testcasesignup() {
	  System.out.println("testcasesignup is excuted successfully");
  }
  
  @Test(priority=3)
  public void testcasedelation() {
	  System.out.println("testcasedelation executed successfully");
  }
  @Test(priority=5)
  public void testcasecreation() {
	  System.out.println("testcasecreation is executed successfully");
  }
  //set priority with description 
  @Test(priority=4,description="I am priority four")
  public void testcaseadmore() {
	  System.out.println("testcaseadmore excute");
  }
}
