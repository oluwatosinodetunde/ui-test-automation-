package pageobject;

import org.openqa.selenium.By;

import Base.BaseTest;

public class contactform extends BaseTest {

	// config
	protected String username = "qat@mailinator.com";
	protected String password = "123456";

	// Actions

	public void click_on_contactus() {

		driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();

	}

	public void get_in_touch() {
		driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']")).isDisplayed();

	}

	public void enter_password(String password) {
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(password);

	}
	
	public void fill_form() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tola");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ty@ymail.com");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Maths");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("God is good");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(4000);	}

//	public void click_on_signin_button() {
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//	}
//	
//	
//	public void wrong_password() {
//		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("3333");
//	}
//	
//	public void click_on_logout() {
//		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
//	
//	}

}
