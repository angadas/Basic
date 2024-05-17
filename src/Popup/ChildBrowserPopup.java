package Popup;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//to handle and get id
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//opane url
		driver.get("https://skpatro.github.io/demo/links/");
		//take new button
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		//
		Set<String> acd = driver.getWindowHandles();
		//to get each  id handal
		 ArrayList<String> arl=new ArrayList<String>(acd);
		 String child = arl.get(1);
		 driver.switchTo().window(child);
		 
		
		
	}

}
