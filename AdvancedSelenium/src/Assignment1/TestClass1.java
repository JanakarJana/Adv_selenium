package Assignment1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {
	@Test
	public void Testcase1() {
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		String title = driver.getTitle();
		Reporter.log("Title"+title);
		driver.findElement(By.xpath("(//a[text()='Blue and green Sneaker'])[2]")).click();
		String title1 = driver.getTitle();
		Reporter.log("Title is "+title1);
		String header = driver.findElement(By.xpath("//h1[contains(text(),'Blue and green Sneaker')]")).getText();
		Reporter.log("Header is "+header);
		String price = driver.findElement(By.xpath("//span[@class='price-value-28']")).getText();
		Reporter.log(price);
		String quantity = driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value");
		Reporter.log("Quantity is "+quantity);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
}

