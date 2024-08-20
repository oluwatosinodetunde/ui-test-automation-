package pageobject;

import org.openqa.selenium.By;

import Base.BaseTest;

public class loginpageobject extends BaseTest {

	// config
	protected String username = "qat@mailinator.com";
	protected String password = "123456";

	// Actions

	public void click_on_login() {

		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();

	}

	public void enter_username(String Username) {
		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(username);

	}

	public void enter_password(String password) {
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(password);

	}

	public void click_on_signin_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	
	public void wrong_password() {
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("3333");
	}
	
	public void incorrect_error_message() {
		driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).isDisplayed();
	
	}

}
