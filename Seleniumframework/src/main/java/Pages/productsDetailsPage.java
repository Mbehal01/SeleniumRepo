package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsDetailsPage extends basePage{
	
	public productsDetailsPage(WebDriver driver) {  
		super(driver);
	}
	
	//Element
	@FindBy(className = "shopping_cart_badge")
	public WebElement shoppingCart;
	
	@FindBy(name= "add-to-cart-sauce-labs-backpack")
	public WebElement addToCart;
	
	public void clickAddtoCart() {
		click(addToCart);
	}
	//Action
	public void clickCart() {
		click(shoppingCart);
	}
	

}
