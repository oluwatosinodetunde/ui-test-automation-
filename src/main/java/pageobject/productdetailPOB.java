package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Base.BaseTest;

public class productdetailPOB extends BaseTest {
	
	// config
	protected String username = "qat@mailinator.com";
	protected String password = "123456";
	
	

	public void products() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
	}
	
	public void add_to_cart() {
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")).click();
	
	}
}
