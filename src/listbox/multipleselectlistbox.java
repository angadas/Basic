package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleselectlistbox {
	private static Select s;

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/HP/Downloads/listbox.html");
		WebElement country = driver.findElement(By.xpath("//select[@id='12345']"));
		Select abc=new Select(country);
		abc.selectByVisibleText("UK");
		abc.selectByVisibleText("Germany");
		abc.selectByIndex(0);
		

		
		

		boolean zxy = abc.isMultiple();
		System.out.println(zxy);
		
		List<WebElement> adc = abc.getAllSelectedOptions();
		for(WebElement s1:adc)
		{
			System.out.println(s1.getText());
		}
		
		WebElement acc = abc.getFirstSelectedOption();
		System.out.println(acc.getText());
			
		List<WebElement> rpt = abc.getOptions();
		
		for(WebElement sdd:rpt)
		{
			System.out.println(sdd.getText());
		}
		
		int size=abc.getOptions().size();
		System.out.println(size);
		
	} 
	
	

}
