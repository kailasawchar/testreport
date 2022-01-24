package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void testsample() {
	  System.out.println("I will try my best");
  }
  @BeforeTest
  public void Beforetestsample() {
	  System.out.println("I am in beforetest");
  }
  @AfterTest
  public void aftertest() {
	  System.out.println(" I am in aftertest");
  }
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("I am in before method");
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("I am in aftermethod");
  }
  @BeforeClass
  public void beforeclass() {
	  System.out.println("I am in before class");
  }
  @AfterClass
  public void afterclass() {
	  System.out.println("I am in afterclass");
  }
  @BeforeSuite
  public void beforesuite() {
	  System.out.println("I am in beforesuite");
  }
  @AfterSuite
  public void aftersuite() {
	  System.out.println("I am in aftersuite");
  }
}
