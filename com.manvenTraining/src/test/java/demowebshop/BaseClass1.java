package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass1 {
	WebDriver driver;
	@Test
	public void testMain() {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
    driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	

}
