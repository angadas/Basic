package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralllel {
		@Test
		public void OpenGoogle() {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.co.in/");
			
		}
		
}
