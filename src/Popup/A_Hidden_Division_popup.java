package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A_Hidden_Division_popup {
	/*Popups are small or separate window which will be displayed when we perform action on 
	any components present in a webpage.
	These popups can be handled by selenium directly, but sometimes we may need to use 3rd 
	party tools to handle these popups.*/
		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
			 driver.manage().window().maximize();
			 

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7350174807");
		

		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		


		
		
		
	}
}

