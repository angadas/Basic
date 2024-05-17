package locator;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.AddWebDriverSpecHeaders;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Xpath_ByAttribute {
	
	public static void main(String[] args) {
		//WebDriver drive=new EdgeDriver(); 
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("73501748047");
		driver.findElement(By.xpath("//input[@type='password'] ")).sendKeys("7350174807asc@123");
		driver.findElement(By.xpath(" //button[text()='Log in']")).click();
	}
	
}