package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends basePage{

	public infoPage(WebDriver driver) {
		super(driver); // Parent class constructor
	}
	
	@FindBy(name = "firstName")
	private WebElement fName;
	
	@FindBy(name = "lastName")
	private WebElement lName;
	
	@FindBy(name = "postalCode")
	private WebElement pCode;

	@FindBy(name = "continue")
	private WebElement cont;
	
	@FindBy(name = "cancel")
	private WebElement cancel;
	
	public void enterDetails() {
		sendKeys(fName, "Priya");
		sendKeys(lName,"Sharma");
		sendKeys(pCode,"52242343242342");
		click(cont);	
	}
	
}
