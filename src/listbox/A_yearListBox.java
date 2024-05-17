package listbox;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_yearListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Thread.sleep(1000);
				Select s=new Select(month);
		s.selectByVisibleText("Jan");
//s.selectByValue("1");
		//s.selectByIndex(3);
		
	}
}
