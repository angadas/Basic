package POM;


import java.io.FileInputStream;


import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class exmpl2_SwagLabTestPage {
FileInputStream file;
Sheet sheet;
	
	WebDriver driver;
	
	SwagLabLoginPage login;
	SwagLabHomePage Home;
	//SwagLabsMenuPage menu;
	@BeforeClass
public void OpenBrowser() throws EncryptedDocumentException, IOException {
		file = new FileInputStream("C:\\Users\\HP\\Desktop\\daily Reading  Notes\\abc\\angad.xlsx");
		 sheet = WorkbookFactory.create(file).getSheet("DDF");
		
		driver = new ChromeDriver();
		driver. get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 login= new SwagLabLoginPage(driver);
		 Home =  new SwagLabHomePage(driver);
		 //SwagLabMenuPage menu = new SwagLabMenuPage(driver);
		
	
}
	@BeforeMethod
public void LoginToPage() throws InterruptedException {
	login.SwagLabLoginPageUN(sheet.getRow(2).getCell(1).getStringCellValue());
	Thread.sleep(2000);
	login.SwagLabsLoginPagePWD(sheet.getRow(2).getCell(2).getStringCellValue());
	Thread.sleep(2000);
	login.SwagLabsLoginPageButton();
	
}
	@Test
public void VerifyTitle() throws InterruptedException {
		Home.SwagLabHomePageYourcartProductName(sheet.getRow(2).getCell(4).getStringCellValue());
		Thread.sleep(2000);
	
}
	@AfterMethod
public void LogoutFromPage() {
		Home.ClickOnProduct();
		
	
}
	@AfterClass
public void ClosedBrowser() {
	driver.close();
}

}


