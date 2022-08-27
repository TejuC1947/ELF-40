package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShoppingCartTest   extends BaseClass1{
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		SoftAssert ast = new SoftAssert();
		ast.assertEquals("checkout", "checkout", "done");
		ast.assertAll();
		
		driver.quit();
		}
}
