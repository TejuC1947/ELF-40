package demowebshop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomRepository.HomePage;
import pomRepository.LoginPageTest1;
import pomRepository.WelcomePage;

public class LoginTest1  extends BaseClass1{
	@Test(dataProvider = "Login")
	public void demo() throws InterruptedException {
		WelcomePage welcompage= new WelcomePage(driver);
		welcompage.clickLogin();
		
		LoginPageTest1 loginpage =  new LoginPageTest1(driver);
		loginpage.enterEmail("tejuappu1947@gmail.com");
		Thread.sleep(2000);
		loginpage.enterPTF("Teju@15");
		loginpage.linkB();
	
		HomePage homepage = new HomePage(driver);
		homepage.logOut();
	}
	@DataProvider(name="Login")
	public Object[][] testData() throws EncryptedDocumentException, IOException {
		
		File file = new File("./testData/testData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Login");
		
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(1).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[row_count-1][col_count];
		
		for(int i=0;i<row_count-1;i++) {
			for(int j=0;j<col_count;j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}

	
}
