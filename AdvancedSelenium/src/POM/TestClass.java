package POM;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
	@Test
	public void regexecute() throws InterruptedException {
	HomePage h = new HomePage(driver);
	h.reglink().click();
	h.reglink().click();
	Thread.sleep(3000);
	h.login().click();
	h.login().click();
	}
	
	@Test
	public void registerexecute() throws InterruptedException {
		RegisterPage r = new RegisterPage(driver);
		r.reglink().click();
		r.reglink().click();
		Thread.sleep(3000);
		r.firstname().sendKeys("jana");
		r.firstname().sendKeys("jjj");
		Thread.sleep(3000);
		r.lastname().sendKeys("jjj");
		r.lastname().sendKeys("jjj");
		Thread.sleep(3000);
	}
}
