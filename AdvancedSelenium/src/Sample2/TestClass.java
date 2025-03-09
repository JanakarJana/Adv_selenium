package Sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	@Test
	public void testcase() {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> cart =  driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement c: cart) {
			c.click();
		}
	}
	@Test
	public void testcase1() {
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		List<WebElement> carts = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement c1 : carts) {
			c1.click();
		}
	}
}
