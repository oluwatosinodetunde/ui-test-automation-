package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageobject.loginpageobject;

public class Incorrectlogindetails extends loginpageobject {
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginSuccessfully() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click_on_login();
		enter_username(username);
		wrong_password();
		click_on_signin_button();
		incorrect_error_message();
		

	}
	
	
}
 