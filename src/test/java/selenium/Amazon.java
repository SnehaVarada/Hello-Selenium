package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import logger.LoggerLoad;

public class Amazon {

	public static void main(String[] args) {
		
		LoggerLoad.info("Entered into the test case of Amazon");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.amazon.com/?tag=hymsabk-20&ref=pd_sl_290dlthsvm_e&adgrpid=1341404752168026&hvadid=83838035949211&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=72660&hvtargid=kwd-83838147155260:loc-190&hydadcr=28884_14559613");
		driver.manage().window().maximize();
         
         WebElement  name = driver.findElement(By.name("customerName")); 
         name.sendKeys("Sneha Varada");
         
         WebElement  email = driver.findElement(By.id("ap_email")); 
         email.sendKeys("Snehasai525@gmail.com");
         
         WebElement pswd = driver.findElement(By.id("ap_password"));
         pswd.sendKeys("AbcXyz");
         
         WebElement pswdchck = driver.findElement(By.id("ap_password_check"));
         pswdchck.sendKeys("AbcXyz");
         
         WebElement cntne = driver.findElement(By.xpath("//input[@id='continue']"));
         cntne.click();
         LoggerLoad.warn("Exiting the test case of Amazon");
         LoggerLoad.error("Are you sure to Exit?");
         driver.close();
         
	}
}
