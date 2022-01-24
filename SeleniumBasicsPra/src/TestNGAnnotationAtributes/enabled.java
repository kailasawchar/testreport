package TestNGAnnotationAtributes;

import org.testng.annotations.Test;

public class enabled {
@Test
public void c_language() {
	System.out.println("C language");
}
@Test(enabled=false)//skip this because enabled=false
public void jira() {
	System.out.println("jira is a tool testing ");
}
@Test(enabled=true)
public void java() {
	System.out.println("java language");
}
}
