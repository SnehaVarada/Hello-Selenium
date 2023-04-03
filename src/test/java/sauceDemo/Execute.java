package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Execute {
	
     WebDriver driver;
	
     @BeforeMethod(alwaysRun=true)

	public void launch() {
	
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--remote-allow-origins=*");

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
	driver = new ChromeDriver(chromeOptions);

	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();

}
     @Test
     
     public void page1() {
    	 SwagLabsLogin sl = new SwagLabsLogin(driver);
    	 sl.username();
    	 sl.password();
    	 sl.loginButton();
     }
     @Test
     public void page2() throws InterruptedException {
    	
    	 SwagLabsLogin sl = new SwagLabsLogin(driver);
    	 sl.username();
    	 sl.password();
    	 sl.loginButton();
    	 
    	 Thread.sleep(1000);
    	 Items i = new Items(driver);
    	 i.hoodie();
    	 i.kart();
    	 i.ikon();
     }
     @Test
     public void page3() throws InterruptedException {
    	
    	 SwagLabsLogin sl = new SwagLabsLogin(driver);
    	 sl.username();
    	 sl.password();
    	 sl.loginButton();
    	 
    	 Thread.sleep(1000);
    	 Items i = new Items(driver);
    	 i.hoodie();
    	 i.kart();
    	 i.ikon();
    	
    	 Thread.sleep(1000);
    	 CheckOut co = new CheckOut(driver);
    	 co.checkout();
    	 co.firstname();
    	 co.lastname();
    	 co.zipcode();
    	 co.conti();
    	 co.finish();
    	  }
     
     @AfterMethod
     public void close() {
     	driver.close();	
     }

}
