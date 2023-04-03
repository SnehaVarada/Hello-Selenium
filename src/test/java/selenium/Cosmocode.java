package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cosmocode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://cosmocode.io/automation-practice/");
		driver.manage().window().maximize();

		WebElement hyprlink = driver.findElement(By.linkText("Click here to reload this page"));
		hyprlink.click();

		WebElement frstName = driver.findElement(By.id("firstname"));
		frstName.sendKeys("XYZ");

		WebElement lastName = driver.findElement(By.className("lastname"));
		lastName.sendKeys("ABC");

		
		  List<WebElement> radio = driver.findElements(By.tagName("input")); for
		  (WebElement e : radio) { 
			  if  (e.getAttribute("value").equalsIgnoreCase("Female")) 
			  { e.click(); 
			  }
			  }
		 	List<WebElement> chckbox = driver.findElements(By.tagName("input"));
		for (WebElement c : chckbox) {
			if (c.getAttribute("value").equalsIgnoreCase("Java")) {
				c.click();
				}
		}
		
		WebElement list = driver.findElement(By.name("age"));
		list.findElement(By.xpath("//option[text()='Under 30']")).click();

		WebElement submt = driver.findElement(By.id("submit_htmlform"));
		submt.click();

		
		  WebElement hyprlink1 = driver.findElement(By.linkText(
		  "random-text-xyz-i-wont-change-random-digit-123")); hyprlink1.click();
		  
		  Alert alert1 = driver.switchTo().alert(); alert1.accept(); // alert1.
		 
		Thread.sleep(3000);
		WebElement hyprlink2 = driver.findElement(By.linkText("Click Me to get Alert"));
		hyprlink2.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(3000);
		WebElement hyprlink3 = driver.findElement(By.linkText("Click Me to open New Window"));
		hyprlink3.click();
		
		  Thread.sleep(3000); String chldbrwsr = driver.getWindowHandle();
		  if(driver.getTitle().equalsIgnoreCase(chldbrwsr)) {
		  driver.switchTo().window(chldbrwsr);
		  
		  }
		 
		//driver.close();
		/*
		 * for(String cb:chldbrwsr) { driver.switchTo().window(cb); }
		 */

		Thread.sleep(2000);
		//driver.close();

	}
}
