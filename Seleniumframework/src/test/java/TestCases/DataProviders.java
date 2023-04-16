package TestCases;

import org.testng.annotations.DataProvider;

public class DataProviders{

	@DataProvider(name="LoginTestDataProvider")
	public Object[][] getInvalidCredentials()
	{
		return new Object[][] {
			{"standard_","secret_sauce"},
			{"test@gmail.com","abc123"},
			{"test@gmail.com","das"}
			
		};
	}

	@DataProvider(name="EmailDataProvider")
	public Object[][] getEmail()
	{
		return new Object[][] {
			{"Admin@gmail.com", "user@gmail.com"},
		};
	}
}