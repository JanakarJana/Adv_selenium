package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program {

	@Test
	public void testcase() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\janakaar\\eclipse java\\AdvancedSelenium\\Data\\data.properties");	// input file is created in data folder
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log(url,true);
		
		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
}
