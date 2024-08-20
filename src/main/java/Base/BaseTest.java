package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;

	
	@BeforeTest
	public void setup() throws IOException {

		if (driver == null) {
			 fr = new FileReader(
					"C:\\Users\\Oluwatosin.Odetunde\\eclipse-workspace\\Automation\\src\\test\\resources\\configfiles\\config.properties");
			 fr1 = new FileReader(
					"C:\\Users\\Oluwatosin.Odetunde\\eclipse-workspace\\Automation\\src\\test\\resources\\configfiles\\locators.properties");
			prop.load(fr);
			loc.load(fr1);
			
			
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();       //base
			//webdrivermanager.chromedriver().setup();
			driver = new ChromeDriver();              //base
			driver.get(prop.getProperty("testurl"));  //properties
			driver.manage().window().maximize();
			
		} 
		else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			//driver.get("https://tele.smarthealth.eclathealthcare.com/");   //properties
			driver.get(prop.getProperty("testurl"));  //properties
			driver.manage().window().maximize();
		}
	}

    @AfterTest
	public void teardown() {
		
		driver.close();
		System.out.println("Teardown successful");

	}

}
