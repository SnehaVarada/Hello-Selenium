package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCosmo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/saisn/eclipse-workspace/Hello-Selenium/src/test/resources/drivers/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement frstName = driver.findElement(By.id("firstname"));
		frstName.sendKeys("XYZ");
		

		WebElement lastName = driver.findElement(By.className("lastname"));
		lastName.sendKeys("ABC");
		
	
    	  WebElement radio = driver.findElement(By.xpath("//input[@value='Female']")); 
		  radio.click();
		  

    	  WebElement chckbx = driver.findElement(By.xpath("//input[@value='java']")); 
		  chckbx.click();
		 

		
		
	
		
	}

}
