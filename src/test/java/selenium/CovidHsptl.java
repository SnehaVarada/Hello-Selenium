package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CovidHsptl {
	//int x;
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	    int x = 0;
	    int o;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisn\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.setAcceptInsecureCerts(true);
		WebDriver  driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

		driver.get("https://westbengal.covidsafe.in/");
		
		//int noOfHospi = driver.findElements(By.xpath("//tbody/tr")).size();
		
		
		  for(int i=1; i<=100;i++){ WebElement hsptl= driver.findElement(By.
		  xpath("//table[@class='result-table table table-borderless table-hover']//tbody//tr["
		  +i+"]//td[1]//strong")); System.out.println(hsptl.getText());}
		 
		
	         for (int j=1;j<=100;j++) { 
	      
		WebElement oxygen= driver.findElement(By. xpath("//table[@class='result-table table table-borderless table-hover']//tbody//tr["+j+"]//td[3]//span[1]"));
	         String oxy = oxygen.getText(); 
	         o = Integer.parseInt(oxy); 
	         System.out.println( "Oxygen list "+o);
			  x=o+x;
			  }
			  System.out.println("total no .of oxygen available" +x); 
			  
			  Thread.sleep(2000);
			 	driver.close();
	
	}
	}
