package TestNGAnnotationAtributes;

import org.testng.annotations.Test;

public class Groups {
@Test (groups= {"software company"})
public void infosys()
{
	System.out.println("infosys");
}
@Test
public void technip() {
	System.out.println("technip India ltd");
}
@Test(groups= {"software company"})
public void wipro() {
	System.out.println("wipro");
	}
@Test(groups= {"software company"})
public void kidtree() {
	System.out.println("kidtree");
}
}

