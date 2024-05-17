package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leftandrightclickActionclass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement mobaile = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions act=new Actions(driver);
		act.click(mobaile).perform();
	}
}
