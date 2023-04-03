package TestNG_Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngEX {

	@BeforeMethod
	public void beforemethod() 
	{
		System.out.println("Before Method");
	}
	@Test (groups = {"smoke" , "sanity"})           
	public void test001() 
	{
		System.out.println(" Exectuing Test001");
		}
	@Test
	public void test002() 
	{
		System.out.println(" Exectuing Test002");
		
		//Assert.assertEquals(false, true)
		}
	@Test
	public void test003() 
	{
	 System.out.println(" Exectuing Test003");
	
	}
	@Test
	public void test004() 
	{
		System.out.println(" Exectuing Test004");
      }
	@AfterMethod 
	public void aftermethod() 
	{
		//WebDriver driver = new ChromeDriver();
		System.out.println("After method");
		//quit();
	 }
	
	
	
}
