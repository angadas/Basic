package dynamicwebelementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class expl1 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("miA3");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement gg = driver.findElement(By.xpath("((//div[@class='puisg-row'])[3]//span)[7]"));
		String kk = gg.getText();
		System.out.println(kk);
		
	}

}
