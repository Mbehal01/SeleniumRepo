package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends basePage{
	
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	//1. page elements 2. Page actions 3. Page factory
	
	@FindBy(id="user-name")
	private WebElement uName; //driver.findElement(By.id("user-name"));
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//h3")
	private WebElement Err;
	
	//2. Page actions
	public void enterUsername(String Uname) {
		sendKeys(uName, Uname);
	}
	
	public void enterPassword(String Pword) {
		sendKeys(pwd,Pword);
	}

	public void clickLogin() {
		click(loginBtn); // waiting for 15 sec and performing
	}	
	
	public String getError() {
		return Err.getText();
	}
}
