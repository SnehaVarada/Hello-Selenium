package TestNG_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertions_Reports {
	
	 @Test
	    public void testAddition() {
	        int a = 5;
	        int b = 10;
	        int expectedResult = 15;
	        int actualResult = a + b;
	        Assert.assertEquals(actualResult, expectedResult, "Addition test failed!");
	        Reporter.log("Addition test passed.");
	    }

	    @Test
	    public void testSubtraction() {
	        int a = 20;
	        int b = 10;
	        int expectedResult = 10;
	        int actualResult = a - b;
	        Assert.assertEquals(actualResult, expectedResult, "Subtraction test failed!");
	        Reporter.log("Subtraction test passed.");
	    }

	}
