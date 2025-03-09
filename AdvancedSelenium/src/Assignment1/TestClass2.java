package Assignment1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 extends BaseClass {
	@Test
	public void Testcase1() {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String title = driver.getTitle();
		Reporter.log("Title"+title);
		driver.findElement(By.xpath("(//a[text()='3rd Album'])[2]")).click();
		String title1 = driver.getTitle();
		Reporter.log("Title is "+title1);
		String header = driver.findElement(By.xpath("//h1[contains(text(),'3rd Album')]")).getText();
		Reporter.log("Header is "+header);
		String price = driver.findElement(By.xpath("//span[@class='price-value-53']")).getText();
		Reporter.log(price);
		String quantity = driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value");
		Reporter.log("Quantity is "+quantity);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
	@Test
	public void Testcase2() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String title = driver.getTitle();
		Reporter.log("Title"+title);
		driver.findElement(By.xpath("(//a[text()='Music 2'])[3]")).click();
		String title1 = driver.getTitle();
		Reporter.log("Title is "+title1);
		String header = driver.findElement(By.xpath("//h1[contains(text(),'Music 2')]")).getText();
		Reporter.log("Header is "+header);
		String price = driver.findElement(By.xpath("//span[@class='price-value-51']")).getText();
		Reporter.log(price);
		String quantity = driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value");
		Reporter.log("Quantity is "+quantity);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
	@Test
	public void Testcase3() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String title = driver.getTitle();
		Reporter.log("Title"+title);
		driver.findElement(By.xpath("(//a[text()='Music 2'])[4]")).click();
		String title1 = driver.getTitle();
		Reporter.log("Title is "+title1);
		String header = driver.findElement(By.xpath("//h1[contains(text(),'Music 2')]")).getText();
		Reporter.log("Header is "+header);
		String price = driver.findElement(By.xpath("//span[@class='price-value-52']")).getText();
		Reporter.log(price);
		String quantity = driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value");
		Reporter.log("Quantity is "+quantity);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
}

