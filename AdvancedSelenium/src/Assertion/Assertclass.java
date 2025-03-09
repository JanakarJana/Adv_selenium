package Assertion;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertclass extends BaseClass{
	@Test
	public void testcase() throws InterruptedException {
		String acturl = driver.getCurrentUrl();
		String expurl = "https://demowebshop.tricentis.com/";
		Assert.assertEquals(acturl, expurl);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String acturl1 = driver.getCurrentUrl();
		String expurl1 = "https://demowebshop.tricentis.com/digital-downloads";
		Assert.assertEquals(acturl1, expurl1);
		boolean cart = driver.findElement(By.xpath("//input[@value='Add to cart']")).isEnabled();
		Assert.assertEquals(cart, true);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(1000);
		String qty = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		String resqty = qty.substring(1, 2);
		Reporter.log(resqty,true);
		int q = Integer.parseInt(resqty);
		SoftAssert s = new SoftAssert();
		s.assertEquals(q, 2);
		driver.findElement(By.xpath("//span[@title='Close']")).click();
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		s.assertAll();
	}

}
