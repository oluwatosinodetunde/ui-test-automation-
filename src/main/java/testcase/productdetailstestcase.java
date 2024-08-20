package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import pageobject.productdetailPOB;
//import pageobject.productdetailPOB;

public class productdetailstestcase extends productdetailPOB {
	
	
    @SuppressWarnings("deprecation")
	@Test
	public void productdetails() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        products();
        add_to_cart();
	}

}
