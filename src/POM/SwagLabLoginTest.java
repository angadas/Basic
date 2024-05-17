package POM;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//main class or Test class
public class SwagLabLoginTest 
{
public static void main(String[] args) throws
InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	SwagLabLoginPage login=new SwagLabLoginPage(driver);
	
	
	login.enterUN();
	login.enterPWD();
	Thread.sleep(1000);
	login.clickOnLoginBtn();
	
	
	SwagLabHomePage home=new SwagLabHomePage(driver);
	home.verifyTitle();
	Thread.sleep(2000);
	home.clickOnMenuBtn();
	
	SwagLabMenuPage menu=new SwagLabMenuPage(driver);
	Thread.sleep(2000);
	menu.clickOnLogout();
	Thread.sleep(3000);
driver.close();
}

}