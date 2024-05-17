package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exmple_xpathbyAtribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7350174807");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7350174807@ascbold");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7350174807@ascbold");
	}

}
