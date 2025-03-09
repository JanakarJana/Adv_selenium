package TestNGListener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	@Test
	public void testcase1() {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(currenturl, "https://demowebshop.tricentis.com/digital-downloads");
	}
	
	@Test
	public void testcase2() {
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(currenturl, "https://demowebshop.tricentis.com/electronics");
	}
}
