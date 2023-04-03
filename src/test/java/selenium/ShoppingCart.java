package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saisn/eclipse-workspace/Hello-Selenium/src/test/resources/drivers/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
		driver.manage().window().maximize();
		
		WebElement dress = driver.findElement(By.xpath("//button[@class='sc-124al1g-0 jCsgpZ'][1]"));
        dress.click();
	}

}
