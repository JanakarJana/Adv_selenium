package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerlink;
	@FindBy(xpath = "//input[@name=\"FirstName\"]")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name=\"LastName\"]")
	private WebElement lastname;
	
	public WebElement reglink() {
		return registerlink;
	}
	public WebElement firstname() {
		return firstname;
	}
	public WebElement lastname() {
		return lastname;
	}
}
