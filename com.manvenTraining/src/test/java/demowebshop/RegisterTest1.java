package demowebshop;

import org.testng.annotations.Test;

import pomRepository.RegisterPage;
import pomRepository.WelcomePage;

public class RegisterTest1 extends BaseClass1 {
	@Test
	public void demo2() {
		WelcomePage welcomepage = new WelcomePage(driver);
		welcomepage.registerLink();
		
		RegisterPage regpage = new RegisterPage(driver);
		regpage.clickGenB();
		regpage.firstName("teju");
		regpage.lastName("appu");
		regpage.emailID("tejuappu1947@gmail.com");
		regpage.passWord("Teju@15");
		regpage.conPwd("Teju@15");
		regpage.regB();
		driver.quit();
		
		
	}

}
