package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallel2 {
		@Test
		private void FB() {
			WebDriver driver=new EdgeDriver();
			
			driver.get("https://www.facebook.com/");
			
		}
}
