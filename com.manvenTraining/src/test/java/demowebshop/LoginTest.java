package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest  extends BaseClass1 {
	@Test
	public void test2() {
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("tejuappu1947@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Teju@15");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
	}

}
