package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Base.BaseTest;

public class SubscriptionPOB extends BaseTest {

	// config
	protected String username = "qat@mailinator.com";
	protected String password = "123456";

	// Actions

	public void click_on_login() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
	    Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,20000)");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("toyo@ymail.com");
		driver.findElement(By.xpath("//*[@id=\"subscribe\"]/i")).click();
		
		
	
		
	}

//	public void enter_username(String Username) {
//		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(username);
//
//	}
//
//	public void enter_password(String password) {
//		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(password);
//
//	}
//
//	public void click_on_signin_button() {
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//	}
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
