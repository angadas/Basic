package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import graphql.schema.diffing.Edge;

public class Webdriver_methode {
	 public static void main(String[] args) {
		 
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://www.facebook.com/");
		 
//		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7350174807");
//		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bold123");
//		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("angad123bold@");
		 driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
	}
}
