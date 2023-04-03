package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tricentisShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saisn/eclipse-workspace/Hello-Selenium/src/test/resources/drivers/chromedriver.exe");
		WebDriver  chromedriver = new ChromeDriver();
		
		chromedriver.get("https://demowebshop.tricentis.com/desktops");
		
		WebElement comp = chromedriver.findElement(By.xpath("(//a[@href='/simple-computer'])[2]/../../../..//input[@class='button-2 product-box-add-to-cart-button']"));
        comp.click();
	}

}
