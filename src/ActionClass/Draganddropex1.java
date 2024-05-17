package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import graphql.schema.diffing.Edge;

public class Draganddropex1 {
	 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement acs = driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		WebElement sss = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions aaa=new Actions(driver);
		Thread.sleep(500);
		//aaa.moveToElement(acs).dragAndDrop().moveToElement(sss).re
		//driver.findElement(By.xpath("//li[text()='Orders']")).click();
			aaa.dragAndDrop(acs, sss).release().perform();
			
		
		
		
		
	}
	}
	

