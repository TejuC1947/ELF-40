package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-female")
	public WebElement genderButton;
	
	public void clickGenB() {
		genderButton.click();
	}
	
	@FindBy(id = "FirstName")
	public WebElement firstNameTF;
	
	public void firstName(String fn) {
		firstNameTF.sendKeys(fn);
	}
	
	@FindBy(id = "LastName")
	public WebElement lastNameTF;
	
	public void lastName(String ln) {
		lastNameTF.sendKeys(ln);
	}
	
	@FindBy(id = "Email")
	public WebElement emailTF;
	
	public void emailID(String e) {
		emailTF.sendKeys(e);
	}
	
	@FindBy(id = "Password")
	public WebElement pwdTF;
	
	public void passWord(String pwd) {
		pwdTF.sendKeys(pwd);
	}
	
	@FindBy(id = "ConfirmPassword")
	public WebElement cpwdTF;
	
	public void conPwd(String CP) {
		cpwdTF.sendKeys(CP);
	}
	
	@FindBy(id = "register-button")
	public WebElement registerB;
	
	public void regB() {
		registerB.click();
	}

	
	}



