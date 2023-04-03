package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class juiceShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver  driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://juiceshop.myspreadshop.com/");
		//driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.getWindowHandle();
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(3000); // To close cookie
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		Thread.sleep(1000); // To select shirt 
		driver.findElement(By.xpath("//img[@class='sprd-img-spinner__image']")).click();
		
	
		Thread.sleep(1000); // to select shirt color
		 driver.findElement(By.xpath("//a[@id='sprd-appearance-list__appearance-134']")).click();
		  
		 Thread.sleep(1000);  // to select shirt size
		 driver.findElement(By.xpath("//button[@id='sprd-detail-sizes__size-4']")). click();
		 
		 Thread.sleep(1000);  // to select add to cart
		 driver.findElement(By.xpath("//button[@class='sprd-button sprd-btn-primary sprd-detail-cta__button sprd-detail-cta--idle']")). click();
			 
	 
		 Thread.sleep(1000);  // to show items in cart
		 driver.findElement(By.xpath("//a[@id='sprd-basket-button']")). click();
		 
		 Thread.sleep(1000);  // to checkout
		 driver.findElement(By.xpath("//button[@class='sprd-basket-checkout__button sprd-button sprd-btn-primary']")). click();
		 
		 Thread.sleep(1000);  // to enter emailId
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcxyz@gmail.com");
		 
		 Thread.sleep(1000);  // to select radio button for honorifics
		 driver.findElement(By.xpath("//input[@name='shipping_salutation'][1]")). click();
		 
		 Thread.sleep(1000);  // to give first name
		 driver.findElement(By.xpath("//input[@id='shipping_firstName']")).sendKeys("ABC");
		 
		 Thread.sleep(1000);  // to give last name
		 driver.findElement(By.xpath("//input[@id='shipping_lastName']")).sendKeys("XYZ");
		 
		 Thread.sleep(1000);  // to give address
		 driver.findElement(By.xpath("//input[@id='field_8']")).sendKeys("404");
		 
		 Thread.sleep(1000);  // to give additional address
		 driver.findElement(By.xpath("//input[@id='shipping_streetAnnex']")).sendKeys("Park Avenue");
		 
		 Thread.sleep(1000);  // drop down to select country
		WebElement country =  driver.findElement(By.xpath("//select[@id='shipping_country']"));
		country.findElement(By.xpath("//option[@value='IN']")).click();
		
		  Thread.sleep(1000);  // to enter Zip
			 driver.findElement(By.xpath("//input[@id='shipping_zipCode']")).sendKeys("678888");
	      
		
		  Thread.sleep(1000); // to enter City
		  driver.findElement(By.xpath("//input[@id='shipping_city']")).sendKeys("Sanford");
		 
			/*
			 * Thread.sleep(1000); // to select state WebElement state =
			 * driver.findElement(By.xpath("//select[@id='shipping_state']"));
			 * state.findElement(By.xpath("//option[@value='FL']")).click();
			 */
		  Thread.sleep(1000); //Delivery ETA
		  driver.findElement(By.xpath("(//span[@class='delivery-eta'])[2]")).click();
		  
		  
		  JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("window.scrollBy(0,250)","");
		  
		  Thread.sleep(1000); // to enter phone number
		  driver.findElement(By.xpath("//input[@id='field_1']")).sendKeys("67857888578");
		  
		  j.executeScript("window.scrollBy(0,250)","");
		  
		
		  Thread.sleep(1000); //gift wrap checkbox
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		/*
		 * Actions A1= new Actions(gift);
		 * A1.moveToElement(gift).click().build().perform();
		 */
		 Thread.sleep(1000); //gift wrap comment box
		 driver.findElement(By.xpath("//textarea[@id='gift-wrapping-text']")).sendKeys("Happy Birthday");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='completeShipping']")).click();
		
		 Thread.sleep(10000);
         driver.close();        		
	}
 
}
