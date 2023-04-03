package TestNG_Examples;

import org.testng.annotations.Test;

public class Prioritization {
	
	  @Test(priority = 1)
	   public void testMethod1() {
	      System.out.println("Test Method 1");
	   }

	   @Test(priority = 2)
	   public void testMethod2() {
	      System.out.println("Test Method 2");
	   }

	   @Test(priority = 3)
	   public void testMethod3() {
	      System.out.println("Test Method 3");
	   }
}
