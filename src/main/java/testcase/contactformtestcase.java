package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageobject.contactform;


public class contactformtestcase extends contactform {
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginSuccessfully() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		click_on_contactus();
		get_in_touch();
		fill_form();

	}
	
	
}
