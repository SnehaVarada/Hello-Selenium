package selenium;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CoreFunctions {
	
	static WebDriver driver;
	
	static {

//		driver = new ChromeDriver();
//		driver.get("https://cosmocode.io/automation-practice/");
//	
		
		}
	
	public static void main(String[] args) throws InterruptedException {
		

		browserCapabilities();
		//selenium101();	

		
	}
	

	private static void browserCapabilities() {
		
		//EdgeOptions
		//FirefoxOptions
		//SafariOptions
		
		
		ChromeOptions chromeOptions = new ChromeOptions();

		// This will make Selenium WebDriver to wait for the entire page is loaded.
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		//This capability checks whether an expired (or) invalid TLS Certificate is used while navigating during a session
		chromeOptions.setAcceptInsecureCerts(true);
		
		//Specifies when to interrupt an executing script in a current browsing context. The default timeout 30,000 ms
		chromeOptions.setScriptTimeout(Duration.ofSeconds(30));
		
		//Specifies the time interval in which web page needs to be loaded in a current browsing context. The default timeout 300,000 ms
		chromeOptions.setPageLoadTimeout(Duration.ofMillis(30000));
		
		//This specifies the time to wait for the implicit element location strategy when locating elements. The default timeout 0 ms
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
	
		//Adding chrome extensions with webdriver
		//chromeOptions.addExtensions(new File("/path/to/extension.crx"));
		
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--incognito");
		//chromeOptions.addArguments("--headless"); //invisible mode of execution
		//more capabilities at https://sites.google.com/a/chromium.org/chromedriver/capabilities
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://cosmocode.io/automation-practice");
			
		System.out.println("Current title of the page : " + driver.getTitle());
		System.out.println("Current URL of the page : " + driver.getCurrentUrl());
		
		driver.navigate().to("https://selenium.dev");
		
		System.out.println("Current title of the page : " + driver.getTitle());
		System.out.println("Current URL of the page : " + driver.getCurrentUrl());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		//driver.close(); //close only current tab
		//driver.quit(); //close all the browser instances/all the tabs
		
		System.out.println("Current page source : " + driver.getPageSource());
		//driver.manage().deleteAllCookies();
		
		
	}
	
	
	
	@Test
	public static void helloSelenium() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");
		
		for(int i=1;i<=120;i++) {
			
			WebElement hospNameEle = new WebDriverWait(driver, Duration.ofSeconds(2))
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//a"))));
			
			String hospName = hospNameEle.getText();
			System.out.println(hospName);	
			
			String totalbeds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//span[contains(text(),'Total Beds')]")).getText();
			System.out.println(totalbeds);	
			
			String vacantBeds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//span[contains(text(),'Vacant')]")).getText();
			System.out.println(vacantBeds);	
			
			driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//div[@class='container']")).click();
			
			String oxygen = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//li[2]//div[2]")).getText();
			
			System.out.println("Oxygen beds : "+oxygen);
			
			String ventilator = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//li[4]//div[2]")).getText();
			
			System.out.println("Ventilator beds : "+ventilator);

			WebElement hosplink = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//a"));
			Actions action = new Actions(driver);
			action.moveToElement(hosplink).build().perform();
			hosplink.click();
			
			WebElement phoneNo = new WebDriverWait(driver, Duration.ofSeconds(3))
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='lblhosCno']"))));
			
			//String phone = driver.findElement(By.xpath("//span[@id='lblhosCno']")).getText();
			
			System.out.println("Phone number : "+phoneNo.getText());
			
			String address = driver.findElement(By.xpath("//label[@id='lblhosaddress']")).getText();
			System.out.println("Address : "+address);
			
			driver.findElement(By.xpath("//div[@class='modal-content']//button/span")).click();
			
		}
		
		
		
	}
	
	@Test
	public static void selenium101() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice/");
		
		WebElement test = driver.findElement(By.name("age"));

		WebElement parent = driver.findElement(By.name("age"));
		
		parent.findElement(By.xpath("//option[text()='Under 20']")).click();
		List<WebElement> ageValies = parent.findElements(By.tagName("options"));
		
		System.err.println(parent.getCssValue("font-family"));
		
		//test.click();
		
		System.out.println("x coordinate : "+test.getRect().getX());
		System.out.println("Y coordinate : "+test.getRect().getY());
		System.out.println("height of the element : "+test.getRect().height);
		System.out.println("width of the element : "+test.getRect().width);
		
		
		List<WebElement> vijayLinks = driver.findElements(By.partialLinkText("vijay"));
		
		if(vijayLinks.size()>0) {
			driver.findElement(By.linkText("vijay")).click();
		}
		else {
			System.out.println("The element you are trying to find is not available");
		}
		
		
		List<WebElement> options = driver.findElements(By.xpath("//select/option"));// to select values from drop down 
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("UNDER 30")) 
			{
				option.click();
			}
			Thread.sleep(1000);
		}
		
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='Checkbox']")); 
		
		for(WebElement checkbox : checkboxs) {
			
			if(checkbox.getAttribute("value").equalsIgnoreCase("Java")) 
			{
				checkbox.click();
			}
			Thread.sleep(1000);
		}
		
		WebElement ageSelect = driver.findElement(By.name("age"));   // to select values from drop down 
		Select agedropdown = new Select(ageSelect);
		
		agedropdown.selectByIndex(2);
		agedropdown.selectByValue("Ghost");
		agedropdown.selectByVisibleText("Not Born");
		
			
		
	}
	

	
	
}


