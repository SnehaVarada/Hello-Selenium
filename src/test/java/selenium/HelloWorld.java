package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/saisn/eclipse-workspace/Hello-Selenium/src/test/resources/drivers/chromedriver.exe");
		WebDriver  chromedriver = new ChromeDriver();
		
		chromedriver.get("https://numpyninja.com/contact");
		
	}

}