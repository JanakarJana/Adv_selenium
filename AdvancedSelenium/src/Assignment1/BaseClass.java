package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver; 
	@BeforeSuite
	public void connectingserver() {
		Reporter.log("connection to the server successfull",true);
	}
	
	@BeforeTest
	public void connectingdatabase() {
		Reporter.log("connecting database successfully",true);
	}
	
	@BeforeClass
	public void openingbrowser() {
		Reporter.log("opening browser",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login successfull",true);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("asdftest1233@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout successfull",true);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterClass
	public void closingbrowser() {
		Reporter.log("closing browser",true);
		driver.quit();
	}
	
	@AfterTest
	public void disconnectingdatabase() {
		Reporter.log("disconnecting database successfull",true);
	}
	
	@AfterSuite
	public void disconnectingserver() {
		Reporter.log("disconnection successfull",true);
	}

}
