package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends basePage{
	
	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement backPack;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(xpath = "//span[text()='Products']")
	private WebElement heading;
	
	// 2. Page actions
	public void clickbackPack() {
		click(backPack);
	}
	public void clickAddToCart() {
		click(addToCart);
	}
	
	public String getHeading() {
		return heading.getText();
	}
}
