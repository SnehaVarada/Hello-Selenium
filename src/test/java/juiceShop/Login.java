package juiceShop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver)
	{
	this.driver=driver;
}
	By dismissal=By.xpath("//*[@aria-label='Close Welcome Banner']");
	By cookie=By.xpath("//div[@role='dialog']//a[text()='Me want it!']");
	By email=By.id("emailControl");
	By dropdown=By.xpath("//*[@class='mat-select-arrow ng-tns-c129-11']");
	By question=By.id("mat-option-4");
	By answer=By.id("securityAnswerControl");
	By register=By.id("registerButton");

	public void clickDismiss()
	
	{
		//driver.manage().deleteAllCookies();
		driver.findElement(dismissal).click();
		
	}
	
	public void clickCookie()
	{
		driver.findElement(cookie).click();
	}
	
	public void sendValues() throws InterruptedException
	{
		driver.findElement(email).click();
		WebElement active = driver.switchTo().activeElement();

		active.sendKeys("sun2brised@email.com", Keys.TAB, "Group4", Keys.TAB, "Group4", Keys.TAB, Keys.TAB);
		driver.findElement(dropdown).click();
		driver.findElement(question).click();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		WebElement e=driver.findElement(answer);
				e.click();
				e.sendKeys("aaaaaaaa",Keys.TAB);
				driver.findElement(register).click();

	}
}
