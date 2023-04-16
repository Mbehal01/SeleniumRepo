package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {

	  @DataProvider(name = "dataproviderdemo")
	  public Object[][] dataProviderMethod() {
	    return new Object[][]{{"data one", "data two"}};
	  }

	  @Test(dataProvider = "dataproviderdemo" )
	  public void testMethod(String data1, String data2) {
	    System.out.println("Data is: " + data1);
	    System.out.println("Data is" + data2);
	  }
	  
	  
	}