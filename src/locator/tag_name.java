package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tag_name {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7350174807");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7350174807asc@143");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
