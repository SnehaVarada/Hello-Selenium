package TestNG_Examples;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider(name = "testData")
	public Object[][] testData(Method method) {
	    if(method.getName().equals("testMethod1")) {
	        return new Object[][] {
	            { "John", 25 },
	            { "Mike", 30 },
	            { "Alice", 20 }};
	    } else {
	        return new Object[][] {
	            { "Mary", 35 },
	            { "Bob", 40 },
	            { "Sarah", 27 } };
	    }
	}

	@Test(dataProvider = "testData")
	public void testMethod1(String name, int age) {
	    //System.out.println("Executing method1");
	}


}
