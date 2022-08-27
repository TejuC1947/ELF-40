package learningMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenBrowerTest {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southkorea = driver.findElement(By.xpath("//div[@id='box105']"));
		Actions act = new Actions(driver);
		act.clickAndHold(seoul).perform();
		Thread.sleep(2000);
		act.release(southkorea).perform();
	}
	
	
	

}
