package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.OverviewPage;
import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.productsDetailsPage;
import Pages.productsPage;
import ReadData.ReadtestData;

public class MyTestCases extends BaseTest{
	
	@Test
	public void Shopping() throws InterruptedException {
		new loginPage(driver).enterUsername(new ReadtestData().getUsername());
		new loginPage(driver).enterPassword(new ReadtestData().getPassword());
		new loginPage(driver).clickLogin();
		new productsPage(driver).clickbackPack();
		new productsDetailsPage(driver).clickAddtoCart();
		new productsDetailsPage(driver).clickCart();
		new cartPage(driver).clickCheckOut();
		new infoPage(driver).enterDetails();
		new OverviewPage(driver).clickFinish();
		String expected = "Thank you for your order!";
		String actual = new completePage(driver).getSuccessMsg();
		Assert.assertEquals(actual, expected); 
	}
}
