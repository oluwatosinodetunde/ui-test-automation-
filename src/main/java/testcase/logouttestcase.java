package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import pageobject.logoutpageobject;

public class logouttestcase extends logoutpageobject {
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginSuccessfully() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click_on_login();
		enter_username(username);
		enter_password(password);
		click_on_signin_button();
		click_on_logout();
		

	
	}
	
	
}
