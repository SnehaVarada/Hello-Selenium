package juiceShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JuiceShop {
	WebDriver driver;
  //@BeforeMethod
	
	public JuiceShop(){
		
	  ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeoptions);

		driver.get("https://juice-shop4.herokuapp.com/#/register");
		driver.manage().window().maximize();
		
		//driver.switchTo().alert().accept();
		/*
		 * WebElement dismiss = driver.findElement(By.
		 * xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']"));
		 * dismiss.click();
		 */
	}
	@Test
	public void demo1() throws InterruptedException
	{
		Login l = new Login(driver);
		Thread.sleep(2000);
		l.clickDismiss();
		Thread.sleep(2000);
		l.clickCookie();
		Thread.sleep(2000);
		l.sendValues();
		
		
	}

}
