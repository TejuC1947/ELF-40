package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest1 {

	public LoginPageTest1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailTF;
	
	public WebElement getEmailTF() {
		return emailTF;
	}
	public void setEmailTF(WebElement emailTF) {
		this.emailTF = emailTF;
	}
	public void enterEmail(String email) {
		emailTF.sendKeys(email);
	}
	@FindBy(id="Password")
	WebElement passwordTF;
	
	public void enterPTF(String password) {
		passwordTF.sendKeys(password);
	}
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	public WebElement linkButton;
	
	public void linkB() {
		linkButton.click();

	
	}
	

}



