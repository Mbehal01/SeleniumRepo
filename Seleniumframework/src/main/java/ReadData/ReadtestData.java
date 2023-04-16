package ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadtestData {   // 1. loading file 2. reading the keys
	
	Properties prop;   //ClassName obj 
	
	static String file = "./src/main/resources/data/data.properties";

public ReadtestData() {
	File src = new File(file);
	try {
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();  // obj= new ClassName();
		prop.load(fis);
	} catch (Exception e) {
		System.out.println("Exception is " + e.getMessage());
	}
}

public String getUsername() {
	return prop.getProperty("Uname");
}


public String getPassword() {
	return prop.getProperty("password");
}

public String getErr() {
	return prop.getProperty("Error");  // Epic sadface: Username and password do not match any user in this service
}

public String getEmptyErr() {
	return prop.getProperty("emptyError");
}

public String getInvalidUname() {
	return prop.getProperty("invaliduname");
}

public String getinvalidpwd() {
	return prop.getProperty("invalidpwd");
}
 public String getFirstName() {
	 return prop.getProperty("firstName");
 }
public String getLastName() {
	return prop.getProperty("lastName");
}
 
public String getZipCode() {
	return prop.getProperty("zipcode");
}
public String getemptyusername() {
	return prop.getProperty("emptyusername");
}
public String getemptypassword() {
	return prop.getProperty("emptypassword");
}
}
