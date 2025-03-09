package Assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class checkin extends Baseclass {
	
	@Test
	public void check() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\janakaar\\eclipse java\\AdvancedSelenium\\Data\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p.getProperty("PIN"));
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//button[contains(@class,'awsui_trigger_hyvsj_3skry_1174')]")).click();
		driver.findElement(By.xpath("//span[text()='Device Library']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(p.getProperty("filter"));
		driver.findElement(By.xpath("//span[@data-value='Device Name : ']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(p.getProperty("devicename"));
		driver.findElement(By.xpath("//div[@class='awsui_option-content_15o6u_ho89k_282 awsui_option-content_2dmmi_qu62t_6']")).click();
		Thread.sleep(2000);
		
		WebElement dsn = driver.findElement(By.xpath("//a[@class='awsui_link_4c84z_iv0u7_141 awsui_variant-primary_4c84z_iv0u7_245 awsui_font-size-body-m_4c84z_iv0u7_474']"));
		String dsnvalue = dsn.getText();
		//Reporter.log(dsnvalue);
		
		driver.findElement(By.xpath("//span[text()='Request Device']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dsnvalue);
		driver.findElement(By.xpath("//span[text()='Validate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='awsui_label-content_1p2cx_jbmfe_206'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='MAA12']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
	}
	
	
}
