package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log(".................Open Browser.................",true);
	}
	
	@BeforeMethod
	public void loginToApp() 
	{
	Reporter.log("--login To App--",true);
	}
	
	@Test
	public void verifyTitle2() 
	{
	Reporter.log("running verifyTitle2 TC",true);
	}
	
	@Test
	public void verifyTitle1() 
	{
	Reporter.log("running verifyTitle1 TC",true);
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
	Reporter.log("--logout from app--",true);
	}
	
	@AfterClass
	public void closeBrowser() 
	{
	Reporter.log("-----------close browser------------",true);
	}

}
