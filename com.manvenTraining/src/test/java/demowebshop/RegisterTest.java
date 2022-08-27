package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest extends BaseClass1 {
	@Test
	public void test1() {
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("teju");
		driver.findElement(By.id("LastName")).sendKeys("appu");
		driver.findElement(By.name("Email")).sendKeys("tejuappu1947@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Teju@15");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Teju@15");
		driver.findElement(By.name("register-button")).click();
		driver.quit();
	}

}
