package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage extends basePage {	
	public completePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "complete-header")
	private WebElement completeHeader;
	
	@FindBy(name = "back-to-products")
	private WebElement backHome;

	
	public String getSuccessMsg() {
		return completeHeader.getText();
	}
	
	public void backHome() {
		click(backHome);
	}
}
