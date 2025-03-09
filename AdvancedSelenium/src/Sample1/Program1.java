package Sample1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program1 {
	@BeforeSuite
	public void connectingserver() {
		Reporter.log("Connection successfull",true);
	}
	
	@AfterSuite
	public void disconnectingserver() {
		Reporter.log("disconnection successfull",true);
	}
	
	@BeforeTest
	public void connectingdatabase() {
		Reporter.log("connecting database successfull",true);
	}
	
	@AfterTest
	public void disconnectingdatabase() {
		Reporter.log("disconnecting database successfull",true);
	}
	
	@BeforeClass
	public void openingbrowser() {
		Reporter.log("opening browser",true);
	}
	
	@AfterClass
	public void Closingbrowser() {
		Reporter.log("closing browser",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login successfull",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout successfull",true);
	}
	
	@Test
	public void testcase() {
		Reporter.log("Testcase execution successfull",true);
	}
}
