package TestNG_Examples;

import org.testng.annotations.Test;

public class Groups {

		@Test(groups = { "group1", "group2" })
	    public void test1() {
	        System.out.println("Executing test1");
	    }

	    @Test(groups = { "group1" })
	    public void test2() {
	    	 System.out.println("Executing test2");
	    }

	    @Test(groups = { "group2" })
	    public void test3() {
	    	 System.out.println("Executing test3");
	    }
	}

