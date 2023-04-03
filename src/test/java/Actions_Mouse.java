import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse {
	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--remote-allow-origins=*");
	chromeOptions.setAcceptInsecureCerts(true);
	WebDriver  driver = new ChromeDriver(chromeOptions);
	driver.manage().window().maximize();

	driver.get("https://the-internet.herokuapp.com/");
	Actions a = new Actions(driver);
	WebElement c=driver.findElement(By.linkText("Checkboxes"));
	a.moveToElement(c).click(c).perform();
//	WebElement check = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
	//a.moveToElement(check).click(check).perform();
//	WebElement check1 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
	//a.moveToElement(check1).click(check1).perform();
	///List<WebElement> checkbox = driver.findElements(By.xpath("//form[@id='checkboxes']//in
	
			List<WebElement> checkbox = driver.findElements(By.xpath("//form[@id='checkboxes']//input"));
			for(WebElement e:checkbox) {
				if(e.isSelected()){
					a.moveToElement(e).click(e).perform();
					
				}
			}
			driver.navigate().back();
			driver.findElement(By.linkText("Drag and Drop")).click();
		
			WebElement d1=driver.findElement(By.xpath("//div[@id='column-a']"));
			WebElement d2=driver.findElement(By.xpath("//div[@id='column-b']"));
			a.dragAndDrop(d1,d2).build().perform();		
			
			
	}
}
