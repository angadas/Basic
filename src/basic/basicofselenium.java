package basic;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basicofselenium {
	

public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//String abc1=driver.getTitle();
		//System.out.println(abc1);
		
		//String xyz = driver.getCurrentUrl();
		
		//Dimension d = new Dimension();
		//d.setSize(400,300);
		
		//Dimension abb1= driver.manage().window().getSize();
		//System.out.println(abb1);
		
		
		
		 
		
	     //Point p = new Point(100,50);
		
		//driver.manage().window().setPosition(p);

		
		

		

	}




	
	
}
