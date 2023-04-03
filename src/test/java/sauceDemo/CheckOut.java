package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	
	WebDriver driver;
	
	public CheckOut(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	//click checkout
	@FindBy (xpath="//button[@id='checkout']") WebElement chck;
	// fill first name
	@FindBy(xpath="//input[@id='first-name']") WebElement fname;
	//fill last name
	@FindBy(xpath="//input[@id='last-name']")  WebElement lname;
	//enter zip code
	@FindBy(xpath="//input[@id='postal-code']")  WebElement post;
	//click on continue button
	@FindBy(xpath="//input[@id='continue']")   WebElement cont;
	//click on finish button
	@FindBy(xpath="//button[@id='finish']")   WebElement fin;
	
	public void checkout() {
		chck.click();
	}
	public void firstname() {
		fname.sendKeys("Numpy");
	}
	public void lastname() {
		lname.sendKeys("ninja");
	}
	public void zipcode() {
		post.sendKeys("32771");
	}
	public void conti() {
		cont.click();
	}
     public void finish() {
	fin.click();
}


}
