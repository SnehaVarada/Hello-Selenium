package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLogin {
	
	public SwagLabsLogin(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//input[@id='user-name']")  WebElement name;
	
	@FindBy (xpath="//input[@id='password']")	WebElement pw;
	
	@FindBy (xpath ="//input[@id='login-button']")   WebElement lbutton;
	
  public void username() {
	  name.sendKeys("standard_user");
  }
  public void password() {
	  pw.sendKeys("secret_sauce");
  }
  public void loginButton() {
      lbutton.click();
  }
  }
  

