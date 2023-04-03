package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Items {
	WebDriver driver;

	public Items(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
    
	@FindBy (xpath="//a[@id='item_5_img_link']")  WebElement hood;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") WebElement cart;
	@FindBy (xpath="//a[@class='shopping_cart_link']") WebElement icon;
	
	public void hoodie() {
		hood.click();
	}
	public void kart() {
		cart.click();
	}
	public void ikon() {
		icon.click();
	}

	}


