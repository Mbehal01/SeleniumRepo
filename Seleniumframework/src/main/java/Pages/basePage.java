package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	WebDriver driver;
	public basePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}
	
	public void waitforElement(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(e));	
	}
	
	public void click(WebElement e) {
		waitforElement(e);
		e.click();
	}
	
	public void sendKeys(WebElement e, String str) {
		waitforElement(e);
		e.clear();
		e.sendKeys(str);
	}
	
	public void scrollToElement(WebElement e) {
		waitforElement(e);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", e);
	}
	
	public void DropDownByIndex(int index, WebElement e) {
		waitforElement(e);
		Select select = new Select(e);
		select.selectByIndex(index);
	}
	
	public void DropDownByVisibleText(String text, WebElement e) {
		waitforElement(e);
		Select select = new Select(e);
		select.selectByVisibleText(text);
	}
	
	public void DropDownByValue(String text, WebElement e) {
		waitforElement(e);
		Select select = new Select(e);
		select.selectByValue(text);
	}
	public void DragAndDrop(WebElement start, WebElement end) {
		waitforElement(start);
		waitforElement(end);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(start, end).perform();
	}
}
