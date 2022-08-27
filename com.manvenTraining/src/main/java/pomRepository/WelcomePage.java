package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='Register']")
	WebElement registerLink;
	
	public void registerLink() {
		registerLink.click();
	}
	
	@FindBy(className = "ico-login")
	WebElement loginLink;
	
	public void clickLogin() {
		loginLink.click();
	}
}



