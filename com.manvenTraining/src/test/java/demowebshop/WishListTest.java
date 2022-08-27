package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WishListTest  extends BaseClass1 {
	@Test 
	public void test4() throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("ELECTRONICS"))).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("(//a[@href=\"/smartphone\"])[1]")).click();
		driver.findElement(By.xpath("//input[@value=\"Add to wishlist\"]")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Phone Cover")).click();
		driver.findElement(By.xpath("//input[@value=\"Add to wishlist\"]")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		SoftAssert ast = new SoftAssert();
		ast.assertEquals("addtocartbutton", "addtocartbutton", "sucessful");
		ast.assertAll();
		driver.quit();
	}

}