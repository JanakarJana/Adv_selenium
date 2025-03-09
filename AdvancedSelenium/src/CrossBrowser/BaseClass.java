package CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void openingbrowser(String browser) {
		if(browser.contains("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.contains("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.contains("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void closingbrowser() {
		driver.quit();
	}
}
