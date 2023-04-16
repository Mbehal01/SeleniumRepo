package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends basePage{

	public OverviewPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(name = "finish")
	private WebElement finish;
	
	@FindBy(name = "cancel")
	private WebElement cancel;
	
	public void clickFinish() {
		click(finish);
	}
	public void clickCancel() {
		click(cancel);
	}
}
