package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.loginPage;
import Pages.productsPage;
import ReadData.ExcelDataProvider;
import ReadData.ReadtestData;

public class LoginScenarios extends BaseTest {
	
	@Test
	public void invalidUsername() {

	new loginPage(driver).enterUsername(new ReadtestData().getInvalidUname()); 
	new loginPage(driver).enterPassword(new ReadtestData().getPassword());
	new loginPage(driver).clickLogin();
	String actualError = new loginPage(driver).getError();
	Assert.assertEquals(actualError, "Epic sadface: Username and password do not match any user in this service");
	}
	
	@Test
	public void invalidPassword() {
		new loginPage(driver).enterUsername(new ReadtestData().getUsername());   // java 8
		new loginPage(driver).enterPassword(new ReadtestData().getinvalidpwd());
		new loginPage(driver).clickLogin();
		String actualError = new loginPage(driver).getError();
		String expectedError = new ReadtestData().getErr();
		Assert.assertEquals(actualError,expectedError);  //Pass or fail decision
	}
	
	@Test
	public void emptyLogin() {
		new loginPage(driver).enterUsername(new ReadtestData().getemptyusername());   // java 8
		new loginPage(driver).enterPassword(new ReadtestData().getemptypassword());
		new loginPage(driver).clickLogin();
		String actualError = new loginPage(driver).getError();
		Assert.assertEquals(actualError,new ReadtestData().getEmptyErr());  //Pass or fail decision
		
	}
	
	@Test
	public void validLogin() {
		new loginPage(driver).enterUsername(new ReadtestData().getUsername());   // java 8
		new loginPage(driver).enterPassword(new ReadtestData().getPassword());
		new loginPage(driver).clickLogin();
		String actual = new productsPage(driver).getHeading();
		String expected = "Products";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(dataProvider="LoginTestDataProvider",dataProviderClass = DataProviders.class)
	public void validLogin_dataproviders(String username, String password) {
		new loginPage(driver).enterUsername(username);   
		new loginPage(driver).enterPassword(password);
		new loginPage(driver).clickLogin();
		
	}
	
	@Test(dataProvider="excelData",dataProviderClass = ExcelDataProvider.class)
	public void validLogin_Exceldataproviders(String keyWord1, String keyWord2) {
		new loginPage(driver).enterUsername(keyWord1);   
		new loginPage(driver).enterPassword(keyWord2); 
		new loginPage(driver).clickLogin();
	}
	
	@Test(dataProvider= "EmailDataProvider", dataProviderClass =DataProviders.class)
	public void dataproviderTest(String param1, String param2) {
		new loginPage(driver).enterUsername(param1);
		new loginPage(driver).enterPassword(param2);
	}
	

}
