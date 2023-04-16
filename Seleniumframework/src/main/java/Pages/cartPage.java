package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends basePage { // IS-A relationship

	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "checkout")  // 1. Page elemenets 2. page constructor 3. page actions
	private WebElement checkOut;
	
	@FindBy(id = "continue-shopping")
	private WebElement contShopping;
	
	public void clickCheckOut() {
		click(checkOut);
	}
	
	public void clickContShopping() {
		click(contShopping);
	}

}
