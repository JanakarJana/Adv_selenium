package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement reglink;
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login;
	
	public WebElement reglink() {
		return reglink;
	}
	
	public WebElement login() {
		return login;
	}
	
}
