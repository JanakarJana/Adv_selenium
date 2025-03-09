package DataProvider;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentTwoDimensional extends BaseClass {
	@Test(dataProvider="Credentials")
	public void testcase(String username, String password) {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}
	
	@DataProvider(name="Credentials")
	public String[][] testdata() {
		String[][] data = new String[3][2];
		
		data[0][0] = "asdftest123@gmail.com";
		data[0][1] = "123456";
		
		data[1][0] = "asdftest1233@gmail.com";
		data[1][1] = "123456";
		
		data[2][0] = "asdftest@gmail.com";
		data[2][1] = "123456";
		return data;
	}
}
