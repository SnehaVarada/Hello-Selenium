package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContextAlertBox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.setAcceptInsecureCerts(true);
		WebDriver  driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Context Menu")).click();
		WebElement cntxtbx= driver.findElement(By.id("hot-spot"));
		cntxtbx.click();
		
		
	}

}
