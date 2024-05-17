package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exmpAlerPop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("101");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
}
