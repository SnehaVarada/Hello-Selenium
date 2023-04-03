package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TutorialsNinja {

	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver  driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

		driver.get("http://tutorialsninja.com/demo/index.php");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		//currency
		driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']")).click();
		//Euro selection
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='EUR']")).click();
		//Selecting camera
		driver.findElement(By.xpath("//img[@title='Canon EOS 5D']")).click();
		// Add to cart
		driver.findElement(By.id("button-cart")).click();
		js.executeScript("window.scrollBy(0,600)", "");
		//Select bug option
		WebElement bug = driver.findElement(By.xpath("//select[@id='input-option226']"));
		bug.click();
		System.out.println(bug.getText());
		Thread.sleep(1000);
		//home page
		driver.navigate().back();
		// Selecting phone
		driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		//Quantity selection
		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		//Add to cart
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		//Success message
		WebElement success = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(success.getText());
		// view cart
		driver.findElement(By.id("cart-total")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		//update quantity to 3
		Thread.sleep(2000);
		WebElement quan = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		quan.clear();
		quan.sendKeys("3");
		quan.click();
		
		//click checkout 
	    WebElement checkout=driver.findElement(By.linkText("Checkout"));
	    checkout.click();
		//printing Error message 
	    WebElement error=driver.findElement(By.
	    xpath("//div[@class='alert alert-danger alert-dismissible']")); 
	     String s1=error.getText(); System.out.println(s1);
	     
	   //update quantity to 0
			Thread.sleep(2000);
			WebElement quan1 = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
			quan1.clear();
			
		 
		
	    Thread.sleep(6000);
		driver.close();
	}

}
